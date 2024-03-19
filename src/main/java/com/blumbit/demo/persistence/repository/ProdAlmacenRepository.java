package com.blumbit.demo.persistence.repository;

import com.blumbit.demo.persistence.entities.ProdAlmacenEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface ProdAlmacenRepository extends ListCrudRepository<ProdAlmacenEntity, Integer> {
}
