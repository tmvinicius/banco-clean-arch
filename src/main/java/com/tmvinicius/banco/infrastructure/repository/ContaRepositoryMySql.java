package com.tmvinicius.banco.infrastructure.repository;


import com.tmvinicius.banco.core.Conta;
import com.tmvinicius.banco.infrastructure.ContaPersistence;
import com.tmvinicius.banco.infrastructure.mapper.ContaEntityMapper;
import com.tmvinicius.banco.usecase.IContaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ContaRepositoryMySql implements IContaRepository {

    private final ICrudRepository repo;
    ContaEntityMapper contaEntityMapper;

    public ContaRepositoryMySql(ICrudRepository repo, ContaEntityMapper contaEntityMapper) {
        this.repo = repo;
        this.contaEntityMapper = contaEntityMapper;
    }

    @Override
    public void salvar(Conta conta) {
        ContaPersistence contaPersistence = contaEntityMapper.toEntity(conta);
        ContaPersistence contaSalva = repo.save(contaPersistence);

    }

    @Override
    public Optional<Conta> buscarPorId(String numeroConta) {
        return repo.findById(numeroConta)
                .map(contaEntityMapper::toDomain);
    }
}
