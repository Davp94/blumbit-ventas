package com.blumbit.demo.persistence.repository;

import com.blumbit.demo.persistence.entities.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

public interface CategoriaRepository extends ListCrudRepository<CategoriaEntity, Integer> {

    //TODO sql native

    // Consultas hql jpql

    //Query Methods
}
