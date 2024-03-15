package com.blumbit.demo.controller;

import com.blumbit.demo.persistence.entities.CategoriaEntity;
import com.blumbit.demo.persistence.repository.CategoriaRepository;
import com.blumbit.demo.service.spec.ICategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoriaController {

    private final ICategoriasService iCategoriasService;

    public CategoriaController(ICategoriasService iCategoriasService) {
        this.iCategoriasService = iCategoriasService;
    }

    @GetMapping("/categorias")
    List<CategoriaEntity> getCategorias(){
        return iCategoriasService.getAllCategoria();
    }

    @PostMapping("/categorias")
    CategoriaEntity createCategorias(@RequestBody CategoriaEntity categoriaEntity ){
        return iCategoriasService.createCategoria(categoriaEntity);
    }

    @PutMapping("/categorias/{categoriaId}")
    CategoriaEntity updateCategorias(@PathVariable("categoriaId") Integer id, @RequestBody CategoriaEntity categoriaEntity ){
        return iCategoriasService.updateCategoria(id, categoriaEntity);
    }

    @DeleteMapping("/categorias/{categoriaId}")
    void deleteCategorias(@PathVariable("categoriaId") Integer id ){
        iCategoriasService.deleteOneById(id);
    }
}
