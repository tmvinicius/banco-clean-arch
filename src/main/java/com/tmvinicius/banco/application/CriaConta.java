package com.tmvinicius.banco.application;

import com.tmvinicius.banco.core.Conta;
import com.tmvinicius.banco.usecase.CriarConta;
import com.tmvinicius.banco.usecase.CriarContaUseCase;

public class CriaConta {


    private final CriarConta criarContaUseCase;

    public CriaConta(CriarConta criarContaUseCase) {
        this.criarContaUseCase = criarContaUseCase;
    }

    public Conta criarConta(){
        return criarContaUseCase.criarConta();
    }

}
