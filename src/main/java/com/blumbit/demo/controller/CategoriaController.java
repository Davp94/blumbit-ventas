package com.blumbit.demo.controller;

import com.blumbit.demo.persistence.entities.CategoriaEntity;
import com.blumbit.demo.persistence.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriaController {

   // @Autowired
   // private CategoriaRepository categoriaRepository;

    private final CategoriaRepository categoriaRepository;

    public CategoriaController(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    //@GetMapping("/")
    //String helloWorld(){
      //  return "Hola mundo";
   // }

    @GetMapping("/categorias")
    List<CategoriaEntity> getCategorias(){

        return categoriaRepository.findAll();
    }
}
