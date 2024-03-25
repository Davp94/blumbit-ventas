package com.blumbit.demo.controller;

import com.blumbit.demo.persistence.entities.AlmacenEntity;
import com.blumbit.demo.persistence.entities.CategoriaEntity;
import com.blumbit.demo.persistence.entities.ProdAlmacenEntity;
import com.blumbit.demo.service.spec.IProductosAlmacenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoAlmacenController {

    private final IProductosAlmacenService productosAlmacenService;

    public ProductoAlmacenController(IProductosAlmacenService productosAlmacenService) {
        this.productosAlmacenService = productosAlmacenService;
    }

    @GetMapping("/productos-almacen")
    List<ProdAlmacenEntity> getAllproductoAlmacen(){
        return this.productosAlmacenService.getAllproductoAlmacen();
    }
    @PostMapping("/productos-almacen")
    ProdAlmacenEntity createProductosAlmacen(@RequestBody ProdAlmacenEntity prodAlmacenEntity ){
        return this.productosAlmacenService.createProductoAlmacen(prodAlmacenEntity);
    }
}
