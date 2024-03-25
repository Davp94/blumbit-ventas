package com.blumbit.demo.persistence.repository;

import com.blumbit.demo.persistence.entities.AlmacenEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface AlmacenRepository extends ListCrudRepository<AlmacenEntity, Integer> {
}
