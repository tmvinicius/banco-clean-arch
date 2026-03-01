package com.tmvinicius.banco.infrastructure.config;

import com.tmvinicius.banco.application.CriaConta;
import com.tmvinicius.banco.application.Saque;
import com.tmvinicius.banco.infrastructure.mapper.ContaEntityMapper;
import com.tmvinicius.banco.infrastructure.repository.ContaRepositoryH2;
import com.tmvinicius.banco.infrastructure.repository.ICrudRepository;
import com.tmvinicius.banco.usecase.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public SacarUseCase sacarUseCase(ContaRepository repo){
        return new SacarUseCase(repo);
    }

    @Bean
    public CriarContaUseCase criarContaUseCase(ContaRepository repo){
        return new CriarContaUseCase(repo);
    }

    @Bean
    public Saque saque(Sacar sacar){
        return new Saque(sacar);
    }

    @Bean
    public CriaConta criaConta(CriarConta criar){return  new CriaConta(criar);}

    @Bean
    public ContaRepository contaRepository(ICrudRepository repo, ContaEntityMapper mapper){
        return new ContaRepositoryH2(repo,mapper);
    }



}
