package com.blumbit.demo.persistence.repository;

import com.blumbit.demo.persistence.entities.ProductoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

//Database access object
public interface ProductoRepository extends ListCrudRepository<ProductoEntity, Integer> {

    //TODO sql native
    @Query(value = "select * from producto_entity pe where pe.fecha_vencimiento <= :date", nativeQuery = true)
    List<ProductoEntity> productListByDate(LocalDate date);

    //Consultas  jpql
    @Query(value = "select ProductoEntity from ProductoEntity where fechaVencimiento <= :date")
    List<ProductoEntity> productListByDateJpql(LocalDate date);

    //Query Methods
    List<ProductoEntity> findAllByFechaVencimientoBefore(LocalDate date);

}
