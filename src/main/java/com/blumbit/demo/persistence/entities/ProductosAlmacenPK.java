package com.blumbit.demo.persistence.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class ProductosAlmacenPK {

    private Integer id_producto;

    private Integer id_almacen;
}
