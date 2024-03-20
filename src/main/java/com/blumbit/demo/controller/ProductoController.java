package com.blumbit.demo.controller;

import com.blumbit.demo.dto.request.UpdateProductosRequestDto;
import com.blumbit.demo.dto.response.UpdateProductoResponseDto;
import com.blumbit.demo.usecase.productos.UpdateProductoUseCase;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api")
public class ProductoController {
    private final UpdateProductoUseCase updateProductoUseCase;

    public ProductoController(UpdateProductoUseCase updateProductoUseCase) {
        this.updateProductoUseCase = updateProductoUseCase;
    }

    @PutMapping("/productos/{productoId}")
    UpdateProductoResponseDto updateProductos(@PathVariable("productoId") Integer id, @RequestBody @Valid UpdateProductosRequestDto productosRequestDto ){
        return updateProductoUseCase.execute(id, productosRequestDto);
    }
}
