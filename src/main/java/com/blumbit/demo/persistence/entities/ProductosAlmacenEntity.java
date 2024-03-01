package com.blumbit.demo.persistence.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class ProductosAlmacenEntity {

    @EmbeddedId
    public ProductosAlmacenPK id;
}
