package com.tmvinicius.banco.infrastructure.controller;

import java.math.BigDecimal;

public record SaqueContaRequest(String numeroConta, BigDecimal valor) {
}
