package com.tmvinicius.banco.usecase;

import com.tmvinicius.banco.core.Conta;
import com.tmvinicius.banco.core.exception.ContaNaoEncontradaException;
import com.tmvinicius.banco.core.exception.SaldoInsuficienteException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class SacarUseCase implements ISacar{

    private final IContaRepository repo;

    public SacarUseCase(IContaRepository repo) {
        this.repo = repo;
    }

    public void sacar(String numeroConta, BigDecimal valor) {

        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser maior que zero");
        }

        Conta conta = repo.buscarPorId(numeroConta)
                .orElseThrow(() -> new ContaNaoEncontradaException(
                        "Conta " + numeroConta + " não encontrada"
                ));

        if (conta.getSaldo().compareTo(valor) < 0) {
            throw new SaldoInsuficienteException(
                    "Saldo da conta " + numeroConta + " insuficiente"
            );
        }

        conta.setSaldo(conta.getSaldo().subtract(valor));
        repo.salvar(conta);
    }
}
