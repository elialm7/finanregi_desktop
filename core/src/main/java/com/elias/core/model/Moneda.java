package com.elias.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "monedas")
public class Moneda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "nombre")
    private String nombre;



}
