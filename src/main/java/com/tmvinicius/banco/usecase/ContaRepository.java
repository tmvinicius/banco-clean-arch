package com.tmvinicius.banco.usecase;

import com.tmvinicius.banco.core.Conta;

import java.util.Optional;

public interface ContaRepository {

    void salvar(Conta conta);

    Optional<Conta> buscarPorId(String numeroConta);

}
