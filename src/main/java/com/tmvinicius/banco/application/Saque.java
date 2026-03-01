package com.tmvinicius.banco.application;

import com.tmvinicius.banco.usecase.Sacar;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class Saque {

    private final Sacar sacarUseCase;

    public Saque(Sacar sacarUseCase) {
        this.sacarUseCase = sacarUseCase;
    }

    public void realizarSaque(String numeroConta, BigDecimal valor) {
        sacarUseCase.sacar(numeroConta, valor);
    }
}

