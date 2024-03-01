package com.blumbit.demo.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance( strategy = InheritanceType.SINGLE_TABLE)
public class Persona {

    @Id
    public String id_persona;

    public String nombres;

    public String apellidos;
}
