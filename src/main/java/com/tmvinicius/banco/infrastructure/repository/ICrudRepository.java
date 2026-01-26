package com.tmvinicius.banco.infrastructure.repository;

import com.tmvinicius.banco.core.Conta;
import org.springframework.data.repository.CrudRepository;

public interface ICrudRepository extends CrudRepository<Conta,String> {
}
