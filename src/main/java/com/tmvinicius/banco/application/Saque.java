package com.tmvinicius.banco.application;

import com.tmvinicius.banco.core.Conta;
import com.tmvinicius.banco.core.exception.SaldoInsuficienteException;
import com.tmvinicius.banco.usecase.ISacar;

import java.math.BigDecimal;

public class Saque {

    private final ISacar sacarUseCase;

    public Saque(ISacar sacarUseCase) {
        this.sacarUseCase = sacarUseCase;
    }

    public void realizarSaque(String numeroConta, BigDecimal valor) {
        sacarUseCase.sacar(numeroConta, valor);
    }
}

