package com.tmvinicius.banco.infrastructure.controller;

import java.math.BigDecimal;

public record SaqueContaResponse (String numeroConta, BigDecimal valor){
}
