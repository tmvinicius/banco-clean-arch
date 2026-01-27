package com.tmvinicius.banco.usecase;

import com.tmvinicius.banco.core.Conta;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface IContaRepository {

    void salvar(Conta conta);

    Optional<Conta> buscarPorId(String numeroConta);

}
