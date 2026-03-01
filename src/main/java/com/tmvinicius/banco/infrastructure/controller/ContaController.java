package com.tmvinicius.banco.infrastructure.controller;

import com.tmvinicius.banco.application.CriaConta;
import com.tmvinicius.banco.application.Saque;
import com.tmvinicius.banco.core.Conta;
import com.tmvinicius.banco.infrastructure.controller.request.CriarContaRequest;
import com.tmvinicius.banco.infrastructure.controller.request.SaqueContaRequest;
import com.tmvinicius.banco.infrastructure.controller.response.CriarContaResponse;
import com.tmvinicius.banco.infrastructure.controller.response.SaqueContaResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contas")
public class ContaController {

    private final Saque saque;
    private final CriaConta criarConta;

    public  ContaController(Saque saque, CriaConta criarConta){
        this.saque = saque;
        this.criarConta = criarConta;
    }

    @PostMapping("/sacar")
    public SaqueContaResponse sacar(@RequestBody SaqueContaRequest request){
        saque.realizarSaque(request.numeroConta(),request.valor());

        return new SaqueContaResponse(request.numeroConta(),request.valor());
    }

    @PostMapping("/criar")
    public CriarContaResponse criar(){
        Conta conta = criarConta.criarConta();
        return new CriarContaResponse("Sua conta foi criada com sucesso: " + conta.getNumeroConta());
    }


}
