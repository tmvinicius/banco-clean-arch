package com.tmvinicius.banco.core;

import java.math.BigDecimal;

public class Conta {

    private String numeroConta;
    private BigDecimal saldo;

    public Conta(String numeroConta, BigDecimal saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public Conta(BigDecimal saldo){
        this.saldo = saldo;
    }

    public Conta(){
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo(){
        return saldo;
    }

    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }

}
