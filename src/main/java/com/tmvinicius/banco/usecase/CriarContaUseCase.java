package com.tmvinicius.banco.usecase;

import com.tmvinicius.banco.core.Conta;
import com.tmvinicius.banco.infrastructure.controller.ContaController;

import java.math.BigDecimal;
import java.util.Random;

public class CriarContaUseCase implements CriarConta {

    private final ContaRepository repo;

    public CriarContaUseCase(ContaRepository repo){
        this.repo = repo;
    }


    @Override
    public Conta criarConta() {
        Random random = new Random();
        int numero = random.nextInt(9000000);

        String numeroConta = String.valueOf(numero);
        Conta contaCriada = new Conta(numeroConta,BigDecimal.valueOf(0.0));

        repo.salvar(contaCriada);

        return contaCriada;
    }
}
