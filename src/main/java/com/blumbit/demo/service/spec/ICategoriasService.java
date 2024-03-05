package com.blumbit.demo.service.spec;

import com.blumbit.demo.persistence.entities.CategoriaEntity;

import java.util.List;
import java.util.Optional;

public interface ICategoriasService {

    CategoriaEntity createCategoria(CategoriaEntity categoriaEntity);

    CategoriaEntity updateCategoria(Integer idCategoria, CategoriaEntity categoriaEntity);

    List<CategoriaEntity> getAllCategoria();

    Optional<CategoriaEntity> getOneById(Integer idCategoria);

    void deleteOneById(Integer idCategoria);
}
