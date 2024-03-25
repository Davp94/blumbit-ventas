package com.blumbit.demo.service.spec;

import com.blumbit.demo.persistence.entities.ProdAlmacenEntity;

import java.util.List;
import java.util.Optional;

public interface IProductosAlmacenService {

    List<ProdAlmacenEntity> getAllproductoAlmacen();
    Optional<ProdAlmacenEntity> getOneById(Integer idProductoAlmacen);
    ProdAlmacenEntity createProductoAlmacen(ProdAlmacenEntity prodAlmacenEntity);
    ProdAlmacenEntity updateProductoAlmacen(Integer idProductoAlmacen, ProdAlmacenEntity prodAlmacenEntity);
    void deleteOneById(Integer idProductoAlmacen);
}
