package com.blumbit.demo.persistence.repository;

import com.blumbit.demo.persistence.entities.AlmacenEntity;
import org.springframework.data.repository.CrudRepository;

public interface AlmacenRepository extends CrudRepository<AlmacenEntity, Integer> {
}
