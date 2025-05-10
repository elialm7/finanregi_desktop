package com.elias.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estados_transaccion")
public class EstadoTransaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;
}
