package com.tmvinicius.banco.infrastructure.repository;

import com.tmvinicius.banco.infrastructure.ContaPersistence;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICrudRepository extends CrudRepository<ContaPersistence,String> {
}
