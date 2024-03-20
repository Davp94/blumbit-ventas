package com.blumbit.demo.dto.request;

import com.blumbit.demo.persistence.entities.CategoriaEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UpdateProductosRequestDto {

    @NotBlank(message = "El campo no puede estar vacio")
    @Size(min = 3, max = 20, message = "El campo debe contener entre 3 y 20 caracteres")
    public String nombre;

    @Size(min = 5, max = 10)
    public String codigo;

    @Min(value = 1, message = "El numero no puede ser menor a 1")
    public Integer categoriaId;
}
