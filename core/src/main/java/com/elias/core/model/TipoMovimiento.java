package com.elias.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_movimiento")
public class TipoMovimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

}
