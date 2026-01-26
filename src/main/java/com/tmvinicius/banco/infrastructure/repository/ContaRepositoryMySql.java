package com.tmvinicius.banco.infrastructure.repository;


import com.tmvinicius.banco.core.Conta;
import com.tmvinicius.banco.usecase.IContaRepository;

import java.util.Optional;


public class ContaRepositoryMySql implements IContaRepository {

    private final ICrudRepository repo;

    public ContaRepositoryMySql(ICrudRepository repo) {
        this.repo = repo;
    }

    @Override
    public void salvar(Conta conta) {
        repo.save(conta);
    }

    @Override
    public Optional<Conta> buscarPorId(String numeroConta) {
        return repo.findById(numeroConta);
    }
}
