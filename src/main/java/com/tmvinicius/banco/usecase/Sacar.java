package com.tmvinicius.banco.usecase;

import java.math.BigDecimal;

public interface Sacar {

    public void sacar(String numeroConta, BigDecimal valor);

}
