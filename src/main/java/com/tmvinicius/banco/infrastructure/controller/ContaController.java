package com.tmvinicius.banco.infrastructure.controller;

import com.tmvinicius.banco.application.Saque;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contas")
public class ContaController {

    private final Saque saque;

    public  ContaController(Saque saque){
        this.saque = saque;
    }

    @PostMapping("/sacar")
    public SaqueContaResponse sacar(@RequestBody SaqueContaRequest request){
        saque.realizarSaque(request.numeroConta(),request.valor());

        return new SaqueContaResponse(request.numeroConta(),request.valor());
    }



}
