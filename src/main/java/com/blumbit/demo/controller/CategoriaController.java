package com.blumbit.demo.controller;

import com.blumbit.demo.dto.request.CategoriaRequestDto;
import com.blumbit.demo.persistence.entities.CategoriaEntity;
import com.blumbit.demo.service.spec.ICategoriasService;
import com.blumbit.demo.usecase.categorias.FindAllCategoriaUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoriaController {

    private final FindAllCategoriaUseCase findAllCategoriaUseCase;

    private final ICategoriasService categoriasService;

    public CategoriaController(FindAllCategoriaUseCase findAllCategoriaUseCase, ICategoriasService categoriasService) {
        this.findAllCategoriaUseCase = findAllCategoriaUseCase;
        this.categoriasService = categoriasService;
    }

    @GetMapping("/categorias")
    List<CategoriaRequestDto> getCategorias(){
        return findAllCategoriaUseCase.execute();
    }

    @PostMapping("/categorias")
    CategoriaEntity createCategorias(@RequestBody CategoriaEntity categoriaEntity ){
        return categoriasService.createCategoria(categoriaEntity);
    }

/*
    @PutMapping("/categorias/{categoriaId}")
    CategoriaRequestDto updateCategorias(@PathVariable("categoriaId") Integer id, @RequestBody CategoriaRequestDto categoriaEntity ){
        return iCategoriasService.updateCategoria(id, categoriaEntity);
    }

    @DeleteMapping("/categorias/{categoriaId}")
    void deleteCategorias(@PathVariable("categoriaId") Integer id ){
        iCategoriasService.deleteOneById(id);
    }*/
}
