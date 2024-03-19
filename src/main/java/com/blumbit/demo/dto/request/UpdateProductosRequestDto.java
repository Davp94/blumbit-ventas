package com.blumbit.demo.dto.request;

import com.blumbit.demo.persistence.entities.CategoriaEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UpdateProductosRequestDto {

    public String nombre;

    public String codigo;

    public Integer categoriaId;
}
