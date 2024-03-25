package com.blumbit.demo.service.impl;

import com.blumbit.demo.persistence.entities.ProdAlmacenEntity;
import com.blumbit.demo.persistence.repository.ProdAlmacenRepository;
import com.blumbit.demo.service.spec.IProductosAlmacenService;

import java.util.List;
import java.util.Optional;

public class ProductosAlmacenImpl implements IProductosAlmacenService {

    private final ProdAlmacenRepository prodAlmacenRepository;

    public ProductosAlmacenImpl(ProdAlmacenRepository prodAlmacenRepository) {
        this.prodAlmacenRepository = prodAlmacenRepository;
    }

    @Override
    public List<ProdAlmacenEntity> getAllproductoAlmacen() {
        return this.prodAlmacenRepository.findAll();
    }

    @Override
    public Optional<ProdAlmacenEntity> getOneById(Integer idProductoAlmacen) {
        return this.prodAlmacenRepository.findById(idProductoAlmacen);
    }

    @Override
    public ProdAlmacenEntity createProductoAlmacen(ProdAlmacenEntity prodAlmacenEntity) {
        return this.prodAlmacenRepository.save(prodAlmacenEntity);
    }

    @Override
    public ProdAlmacenEntity updateProductoAlmacen(Integer idProductoAlmacen, ProdAlmacenEntity prodAlmacenEntity) {
        return null;
    }

    @Override
    public void deleteOneById(Integer idProductoAlmacen) {
        this.prodAlmacenRepository.deleteById(idProductoAlmacen);
    }
}
