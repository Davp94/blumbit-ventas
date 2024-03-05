package com.blumbit.demo.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "audit")
public class AuditEntity { //audit_entity   audit   audits

    @Id
    @Column(name = "id_audit", nullable = false)
    public Integer id_audit;       // id => id_audit // =>pk_audit

    @Column(length = 30, unique = true, updatable = true, insertable = true)
    public String aud_resource;

    @Column(name = "aud_operation", nullable = false)
    public String aud_operation;

    public Date createdDate;

    public Integer userId;
}
