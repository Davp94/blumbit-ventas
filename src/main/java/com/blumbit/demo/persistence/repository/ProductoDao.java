package com.blumbit.demo.persistence.repository;

import com.blumbit.demo.persistence.entities.ProductoEntity;
import org.springframework.data.repository.ListCrudRepository;

//Database access object
public interface ProductoDao extends ListCrudRepository<ProductoEntity, Integer> {
}
