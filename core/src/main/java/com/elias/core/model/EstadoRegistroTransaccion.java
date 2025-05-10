package com.elias.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estados_registros_transaccion")
public class EstadoRegistroTransaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;
}
