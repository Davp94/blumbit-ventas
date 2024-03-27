package com.blumbit.demo.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer id_categoria;

    public String cat_nombre;

    public String cat_descripcion;

    public Short cat_estado;

/*    @OneToMany
    @JoinColumn(name = "id_producto")
    public List<ProductoEntity> productoEntityList;*/

    //DATOS AUDITORIA

    public Date fecha_registro;

    public Date fecha_baja;

    public Integer ususario_baja;

    public Integer ususario_creacion;
}
