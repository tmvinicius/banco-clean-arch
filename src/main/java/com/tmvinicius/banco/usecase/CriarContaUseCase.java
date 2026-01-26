package com.tmvinicius.banco.usecase;

import com.tmvinicius.banco.core.Conta;

import java.math.BigDecimal;

public class CriarContaUseCase implements ICriarConta{

    private final IContaRepository repo;

    public CriarContaUseCase(IContaRepository repo){
        this.repo = repo;
    }


    @Override
    public void criarConta() {
        Conta contaCriada = new Conta(BigDecimal.valueOf(0.0));
    }
}
