package com.blumbit.demo.service.impl;

import com.blumbit.demo.persistence.entities.CategoriaEntity;
import com.blumbit.demo.persistence.repository.CategoriaRepository;
import com.blumbit.demo.service.spec.ICategoriasService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriasServiceImpl implements ICategoriasService {

    private final CategoriaRepository categoriaRepository;

    public CategoriasServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public CategoriaEntity createCategoria(CategoriaEntity categoriaEntity) {
        //Validaciones
        //Llamada builder mappers
        //Logica ...
        return categoriaRepository.save(categoriaEntity);
    }

    @Override
    public CategoriaEntity updateCategoria(Integer idCategoria, CategoriaEntity categoriaEntity) {
        Optional<CategoriaEntity> findCategoriaEntity = categoriaRepository.findById(idCategoria);

        if(findCategoriaEntity!= null){
            CategoriaEntity existCategoriaEntity = findCategoriaEntity.get();
            existCategoriaEntity.setCat_nombre(categoriaEntity.getCat_nombre());
            existCategoriaEntity.setCat_descripcion(categoriaEntity.getCat_descripcion());
            return categoriaRepository.save(existCategoriaEntity);
        }else {
            return null;
        }
    }

    @Override
    public List<CategoriaEntity> getAllCategoria() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<CategoriaEntity> getOneById(Integer idCategoria) {
        return categoriaRepository.findById(idCategoria);
    }

    @Override
    public void deleteOneById(Integer idCategoria) {
        categoriaRepository.deleteById(idCategoria);
    }
}
