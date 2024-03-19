package com.blumbit.demo.persistence.entities;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;

@Entity
public class AlmacenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer id_almacen;

    public String alm_nombre;

    public Time horario;

/*    @ManyToMany
    @JoinTable(name = "producto_almacen", joinColumns =
    @JoinColumn(name = "id_almacen"), inverseJoinColumns = @JoinColumn(name="id_producto"))
    public List<ProductoEntity> productoEntityList;*/
}
