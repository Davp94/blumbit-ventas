package com.blumbit.demo.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@Inheritance( strategy = InheritanceType.JOINED)
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer id_persona;

    public String username;

    public String password;

    public String email;

    public boolean locked;

    public String nombres;

    public String apellidos;
}
