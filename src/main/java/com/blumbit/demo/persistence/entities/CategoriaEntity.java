package com.blumbit.demo.persistence.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class CategoriaEntity {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremental 1,2 ,3 , ....
    @GeneratedValue(strategy = GenerationType.SEQUENCE)  //use sequence database
//    @GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
//    @TableGenerator(name = "table-generator", table = "productos", pkColumnName = "id_producto")
    public Integer id_categoria;

    public String cat_nombre;

    public String cat_descripcion;

    public Short cat_estado;

    @OneToMany
    @JoinColumn(name = "id_producto")
    public List<ProductoEntity> productoEntityList;

    //DATOS AUDITORIA

    public Date fecha_registro;

    public Date fecha_baja;

    public Integer ususario_baja;

    public Integer ususario_creacion;
}
