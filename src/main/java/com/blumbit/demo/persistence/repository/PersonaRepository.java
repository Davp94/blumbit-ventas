package com.blumbit.demo.persistence.repository;

import com.blumbit.demo.persistence.entities.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {
}
