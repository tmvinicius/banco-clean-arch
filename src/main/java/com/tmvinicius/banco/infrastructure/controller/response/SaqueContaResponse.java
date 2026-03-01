package com.tmvinicius.banco.infrastructure.controller.response;

import java.math.BigDecimal;

public record SaqueContaResponse (String numeroConta, BigDecimal valor){
}
