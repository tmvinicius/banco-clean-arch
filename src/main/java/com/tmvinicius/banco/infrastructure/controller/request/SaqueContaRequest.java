package com.tmvinicius.banco.infrastructure.controller.request;

import java.math.BigDecimal;

public record SaqueContaRequest(String numeroConta, BigDecimal valor) {
}
