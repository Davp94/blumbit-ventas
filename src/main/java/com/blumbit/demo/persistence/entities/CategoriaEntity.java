package com.blumbit.demo.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CategoriaEntity {

    @Id
    public Integer id_categoria;

    public String cat_nombre;

    public String cat_descripcion;

    public Short cat_estado;
}
