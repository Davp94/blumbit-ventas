package com.blumbit.demo.dto.response;

import com.blumbit.demo.persistence.entities.AlmacenEntity;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class UpdateProductoResponseDto {

    @NotNull
    public Integer id_producto;

    @NotBlank
    public String nombre;

    @Size(min = 5, max = 10)
    public String codigo;

    public LocalDate fecha_vencimiento;

    @Min(value = 1)
    @Max(value = 10)
    public Integer categoriaId;

    @NotEmpty
    public List<AlmacenEntity> almacenes;
}
