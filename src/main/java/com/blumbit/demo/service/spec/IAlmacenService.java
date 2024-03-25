package com.blumbit.demo.service.spec;

import com.blumbit.demo.persistence.entities.AlmacenEntity;
import com.blumbit.demo.persistence.entities.ProductoEntity;

import java.util.List;

public interface IAlmacenService {

    List<AlmacenEntity> getAllAlmacenes();
}
