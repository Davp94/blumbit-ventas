package com.blumbit.demo.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class ProductoEntity { //producto_entity

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer id_producto;

    public String nombre;

    public String codigo;

    @Column(name = "fecha_vencimiento")
    public LocalDate fechaVencimiento;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    public CategoriaEntity categoriaEntity;
}
