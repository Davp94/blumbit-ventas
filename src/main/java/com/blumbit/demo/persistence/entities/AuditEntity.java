package com.blumbit.demo.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "audit", schema = "auditoria")
public class AuditEntity { //audit_entity   audit   audits

    @Id
    @Column(name = "id_audit", nullable = false)
    public Integer id;       // id => id_audit // =>pk_audit

    @Column(length = 30, unique = true, updatable = true, insertable = true)
    public String resource;

    public String operation;

    public Date createdDate;

    public Integer userId;
}
