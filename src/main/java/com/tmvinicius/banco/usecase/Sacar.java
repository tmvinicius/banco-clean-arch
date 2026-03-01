package com.tmvinicius.banco.usecase;

import com.tmvinicius.banco.core.Conta;

import java.math.BigDecimal;

public interface ISacar {

    public void sacar(String numeroConta, BigDecimal valor);

}
