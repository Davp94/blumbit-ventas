package com.blumbit.demo.controller;

import com.blumbit.demo.dto.request.CategoriaRequestDto;
import com.blumbit.demo.persistence.entities.AlmacenEntity;
import com.blumbit.demo.service.spec.IAlmacenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlmacenController {

    private final IAlmacenService almacenService;

    public AlmacenController(IAlmacenService almacenService) {
        this.almacenService = almacenService;
    }

    @GetMapping("/almacenes")
    List<AlmacenEntity> getCategorias(){
        return this.almacenService.getAllAlmacenes();
    }
}
