package com.blumbit.demo.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoriaRequestDto {

    //TODO VALID FIELDS

    public Integer id_categoria;

    public String cat_nombre;

    public String cat_descripcion;

    public Short cat_estado;
}
