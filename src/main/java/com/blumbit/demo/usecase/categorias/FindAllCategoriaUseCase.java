package com.blumbit.demo.usecase.categorias;

import com.blumbit.demo.common.UseCase;
import com.blumbit.demo.dto.request.CategoriaRequestDto;
import com.blumbit.demo.dto.request.UpdateProductosRequestDto;
import com.blumbit.demo.persistence.entities.CategoriaEntity;
import com.blumbit.demo.service.impl.CategoriasServiceImpl;
import com.blumbit.demo.service.spec.ICategoriasService;
import com.blumbit.demo.usecase.productos.UpdateProductoUseCase;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@UseCase
public class FindAllCategoriaUseCase {

    private final ICategoriasService iCategoriasService;

    // private final UpdateProductoUseCase updateProductoUseCase;

    public FindAllCategoriaUseCase(ICategoriasService iCategoriasService, UpdateProductoUseCase updateProductoUseCase) {
        this.iCategoriasService = iCategoriasService;
        //this.updateProductoUseCase = updateProductoUseCase;
    }

    public List<CategoriaRequestDto> execute(){
        List<CategoriaEntity> categoriasFromService = this.iCategoriasService.getAllCategoria();

        //if(validations(categoriasFromService)) {
        return buildCategoria(categoriasFromService);
        /*}
        return null;*/
    }

    private List<CategoriaRequestDto> buildCategoria(List<CategoriaEntity> categorias){
        List<CategoriaRequestDto> categoriasDto = new ArrayList<>();
        CategoriaRequestDto categoriaRequestDto = new CategoriaRequestDto();
        for (int i = 0; i< categorias.size(); i++){
            categoriaRequestDto.id_categoria = categorias.get(i).id_categoria;
            categoriaRequestDto.setCat_nombre(categorias.get(i).cat_nombre);
            categoriaRequestDto.setCat_descripcion(categorias.get(i).cat_descripcion);
            categoriaRequestDto.setCat_estado(categorias.get(i).cat_estado);
            categoriasDto.add(categoriaRequestDto);
        }
        return categoriasDto;
    }

  /*  private boolean validations(List<CategoriaEntity> categorias){
        UpdateProductosRequestDto updateProductosRequestDto = new UpdateProductosRequestDto();
        updateProductosRequestDto.setCategoriaId(1);
        updateProductosRequestDto.setNombre("NN");
        //updateProductoUseCase.execute(1, updateProductosRequestDto);
        //TODO VALIDATIONS
        return true;
    }*/

}
