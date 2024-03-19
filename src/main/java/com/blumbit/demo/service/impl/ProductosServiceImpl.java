package com.blumbit.demo.service.impl;

import com.blumbit.demo.persistence.entities.ProductoEntity;
import com.blumbit.demo.persistence.entities.ProductoEntity;
import com.blumbit.demo.persistence.repository.ProductoRepository;
import com.blumbit.demo.service.spec.IProductosService;
import com.blumbit.demo.service.templateReq.ProductJdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ProductosServiceImpl implements IProductosService {

    private final ProductoRepository productoRepository;

    private final ProductJdbcTemplate productJdbcTemplate;

    @Autowired
    public ProductosServiceImpl(ProductoRepository productoRepository, ProductJdbcTemplate productJdbcTemplate) {
        this.productoRepository = productoRepository;
        this.productJdbcTemplate = productJdbcTemplate;
    }

    @Override
    public List<ProductoEntity> getAllproducto() {
        return productoRepository.findAll();
    }

    @Override
    public List<ProductoEntity> getAllproductoQueryMethod(LocalDate date) {
        return productoRepository.findAllByFechaVencimientoBefore(date);
    }

    @Override
    public List<ProductoEntity> getAllproductoNativeQuery(LocalDate date) {
        return productoRepository.productListByDate(date);
    }

    @Override
    public List<ProductoEntity> getAllproductoJpqlQuery(LocalDate date) {
        return productoRepository.productListByDateJpql(date);
    }

    @Override
    public List<ProductoEntity> getAllproductoJdbctemplate(LocalDate date) {
        return productJdbcTemplate.getAllByDate(date);
    }

    @Override
    public Optional<ProductoEntity> getOneById(Integer idProducto) {
        return productoRepository.findById(idProducto);
    }

    @Override
    public ProductoEntity createproducto(ProductoEntity productoEntity) {
        return productoRepository.save(productoEntity);
    }

    @Override
    public ProductoEntity updateproducto(Integer idProducto, ProductoEntity productoEntity) {
        Optional<ProductoEntity> findProductoEntity = productoRepository.findById(idProducto);

        if(findProductoEntity!= null){
            ProductoEntity existProductoEntity = findProductoEntity.get();
            existProductoEntity.setNombre(productoEntity.getNombre());
            existProductoEntity.setCodigo(productoEntity.getCodigo());
            existProductoEntity.setCategoriaEntity(productoEntity.getCategoriaEntity());
            return productoRepository.save(productoEntity);
        }else {
            return null;
        }
    }

    @Override
    public void deleteOneById(Integer idProducto) {
        productoRepository.deleteById(idProducto);
    }
}
