package com.blumbit.demo.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProductoEntity { //producto_entity

    @Id
    public Integer id_producto;

    public String nombre;

    public String codigo;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    public CategoriaEntity categoriaEntity;
}
