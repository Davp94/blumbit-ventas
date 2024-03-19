package com.blumbit.demo.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UpdateProductoResponseDto {

    public Integer id_producto;

    public String nombre;

    public String codigo;

    public LocalDate fecha_vencimiento;

    public Integer categoriaId;
}
