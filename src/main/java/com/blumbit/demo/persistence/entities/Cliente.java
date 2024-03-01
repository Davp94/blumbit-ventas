package com.blumbit.demo.persistence.entities;

import jakarta.persistence.Entity;

@Entity
public class Cliente extends Persona{

    public String cliente_code;
}
