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
        for (CategoriaEntity categoria : categorias) {
            System.out.println("CATEGORIA" + categoria);
            categoriaRequestDto.setId_categoria(categoria.getId_categoria());
            categoriaRequestDto.setCat_nombre(categoria.getCat_nombre());
            categoriaRequestDto.setCat_descripcion(categoria.getCat_descripcion());
            categoriaRequestDto.setCat_estado(categoria.getCat_estado());
            System.out.println("CATEGORIA REQUEST"+ categoriaRequestDto);
            categoriasDto.add(categoriaRequestDto);
            categoriaRequestDto = null;
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
