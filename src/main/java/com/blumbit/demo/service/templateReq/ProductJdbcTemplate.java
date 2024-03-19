package com.blumbit.demo.service.templateReq;

import com.blumbit.demo.persistence.entities.ProductoEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductJdbcTemplate {

    private final JdbcTemplate jdbcTemplate;

    public ProductJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<ProductoEntity> getAllByDate(LocalDate date){
        String sql = "select * from producto_entity where fecha_vencimiento <= :date";
        return this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(ProductoEntity.class));
    }
}
