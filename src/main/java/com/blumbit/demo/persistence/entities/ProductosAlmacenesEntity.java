package com.blumbit.demo.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(ProductosAlmacenPK.class)
public class ProductosAlmacenesEntity {

    @Id
    public Integer id_producto;

    @Id
    public Integer id_almacen;
}
