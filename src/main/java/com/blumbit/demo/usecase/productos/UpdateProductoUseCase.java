package com.blumbit.demo.usecase.productos;

import com.blumbit.demo.common.UseCase;
import com.blumbit.demo.dto.request.CategoriaRequestDto;
import com.blumbit.demo.dto.request.UpdateProductosRequestDto;
import com.blumbit.demo.dto.response.UpdateProductoResponseDto;
import com.blumbit.demo.persistence.entities.CategoriaEntity;
import com.blumbit.demo.persistence.entities.ProductoEntity;
import com.blumbit.demo.service.spec.ICategoriasService;
import com.blumbit.demo.service.spec.IProductosService;

import java.util.ArrayList;
import java.util.List;

@UseCase
public class UpdateProductoUseCase {

    private final IProductosService productosService;

    private final ICategoriasService categoriasService;

    public UpdateProductoUseCase(IProductosService productosService, ICategoriasService categoriasService) {
        this.productosService = productosService;
        this.categoriasService = categoriasService;
    }

    public UpdateProductoResponseDto execute(Integer idProducto, UpdateProductosRequestDto updateProductosRequestDto){
        ProductoEntity productoEntity = productosService.getOneById(idProducto).orElse(null);
        if(validation(updateProductosRequestDto)){
            if(productoEntity != null){
                CategoriaEntity categoriaEntity = categoriasService.getOneById(updateProductosRequestDto.categoriaId).orElse(null);
                productoEntity.setNombre(updateProductosRequestDto.getNombre());
                productoEntity.setCodigo(updateProductosRequestDto.getCodigo());
                productoEntity.setCategoriaEntity(categoriaEntity);
            }
            productoEntity = productosService.updateproducto(idProducto, productoEntity);
            return buildProductoResponse(productoEntity);
        }else {
            //TODO CALL EXCEPTION
            return null;
        }

    }

    private UpdateProductoResponseDto buildProductoResponse(ProductoEntity productoEntity){
        UpdateProductoResponseDto updateProductoResponseDto = new UpdateProductoResponseDto();
        updateProductoResponseDto.setId_producto(productoEntity.getId_producto());
        updateProductoResponseDto.setNombre(productoEntity.getCodigo());
        updateProductoResponseDto.setCodigo(productoEntity.getCodigo());
        updateProductoResponseDto.setCategoriaId(productoEntity.getCategoriaEntity().getId_categoria());
        updateProductoResponseDto.setFecha_vencimiento(productoEntity.getFechaVencimiento());
        return updateProductoResponseDto;
    }

    private boolean validation(UpdateProductosRequestDto updateProductosRequestDto){

        try {
            Integer cod_categoria = updateProductosRequestDto.getCategoriaId();
            CategoriaEntity categoriaEntity = categoriasService.getOneById(updateProductosRequestDto.categoriaId).orElse(null);
            return true;
        }catch (NullPointerException e){

        }
        return false;
    }
}
