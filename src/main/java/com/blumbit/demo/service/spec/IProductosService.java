package com.blumbit.demo.service.spec;

import com.blumbit.demo.persistence.entities.ProductoEntity;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IProductosService {
    List<ProductoEntity> getAllproducto();
    List<ProductoEntity> getAllproductoQueryMethod(LocalDate date);
    List<ProductoEntity> getAllproductoNativeQuery(LocalDate date);
    List<ProductoEntity> getAllproductoJpqlQuery(LocalDate date);
    List<ProductoEntity> getAllproductoJdbctemplate(LocalDate date);
    Optional<ProductoEntity> getOneById(Integer idProducto);
    ProductoEntity createproducto(ProductoEntity productoEntity);
    ProductoEntity updateproducto(Integer idProducto, ProductoEntity productoEntity);
    void deleteOneById(Integer idProducto);
}
