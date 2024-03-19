package com.blumbit.demo.persistence.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ProdAlmacenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer id_producto_almacen;

    @ManyToOne
    @JoinColumn(name = "productoEntity_id_producto")
    public ProductoEntity productoEntity;

    @ManyToOne
    @JoinColumn(name = "almacen_id_almacen")
    public AlmacenEntity almacen;

    public Date createdDate;

    public Integer user_id;

}
