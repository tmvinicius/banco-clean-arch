package com.tmvinicius.banco.infrastructure;

import com.tmvinicius.banco.core.Conta;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "CONTA")
public class ContaPersistence {

    @Id
    @Column(name="numero_conta",unique = true,length = 7)
    private String numeroConta;
    @Column(name = "saldo",nullable = false)
    private BigDecimal saldo;

    public ContaPersistence(){

    }

    public ContaPersistence(String numeroConta, BigDecimal saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
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
