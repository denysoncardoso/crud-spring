package com.teste.crudspring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Corte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 200, nullable = false)
    private String nome;

    @Column
    private String descricao;

    @Column(length = 50, nullable = false)
    private String categoria;
    
}
