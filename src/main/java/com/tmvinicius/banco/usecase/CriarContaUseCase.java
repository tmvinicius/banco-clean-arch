package com.tmvinicius.banco.usecase;

import com.tmvinicius.banco.core.Conta;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CriarContaUseCase implements ICriarConta{

    private final IContaRepository repo;

    public CriarContaUseCase(IContaRepository repo){
        this.repo = repo;
    }


    @Override
    public void criarConta() {
        Conta contaCriada = new Conta(BigDecimal.valueOf(0.0));

        repo.salvar(contaCriada);
    }
}
