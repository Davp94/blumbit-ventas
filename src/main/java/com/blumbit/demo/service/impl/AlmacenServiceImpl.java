package com.blumbit.demo.service.impl;

import com.blumbit.demo.persistence.entities.AlmacenEntity;
import com.blumbit.demo.persistence.repository.AlmacenRepository;
import com.blumbit.demo.service.spec.IAlmacenService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlmacenServiceImpl implements IAlmacenService {

    private final AlmacenRepository almacenRepository;

    public AlmacenServiceImpl(AlmacenRepository almacenRepository) {
        this.almacenRepository = almacenRepository;
    }


    @Override
    public List<AlmacenEntity> getAllAlmacenes() {
        return this.almacenRepository.findAll();
    }
}
