package com.tmvinicius.banco.infrastructure;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Table(name = "CONTA")
public class ContaPersistence {

    @Id
    @Column(name="numero_conta",unique = true,length = 7)
    private String numeroConta;
    @Column(name = "saldo",nullable = false)
    private BigDecimal saldo;

}
