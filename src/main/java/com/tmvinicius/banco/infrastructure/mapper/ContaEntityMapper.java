package com.tmvinicius.banco.infrastructure.mapper;

import com.tmvinicius.banco.core.Conta;
import com.tmvinicius.banco.infrastructure.ContaPersistence;
import org.springframework.stereotype.Component;

@Component
public class ContaEntityMapper {

    public ContaPersistence toEntity (Conta conta){
        return new ContaPersistence(conta.getNumeroConta(), conta.getSaldo());
    }

    public Conta toDomain (ContaPersistence persistence){
        return new Conta(persistence.getNumeroConta(), persistence.getSaldo());
    }

}
