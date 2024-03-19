package com.blumbit.demo.persistence.entities;

import jakarta.persistence.*;

@Entity
//@Inheritance( strategy = InheritanceType.JOINED)
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer id_persona;

    public String username;

    public String password;

    public String email;

    public String nombres;

    public String apellidos;
}
