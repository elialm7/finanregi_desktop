package com.elias.core.model;
import jakarta.persistence.*;

@Entity
@Table(name = "transacciones_diarias ")
public class TransaccionDiaria {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "es_transferencia")
    private Boolean esTransferencia;

    @Column(name ="numero")
    private String numero;

    @Column(name = "beneficiario")
    private String beneficiario;

    @Column(name = "memo")
    private String memo;

    @Column(name = "cantidad")
    private Double cantidad;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha ")
    private java.util.Date fecha;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "cuenta_origen_id")
    private Cuenta cuentaOrigen;

    @ManyToOne
    @JoinColumn(name = "cuenta_destino_id")
    private Cuenta cuentaDestino;

    @ManyToOne
    @JoinColumn(name = "moneda_id")
    private Moneda moneda;

    @ManyToOne
    @JoinColumn(name = "tipo_movimiento_id")
    private TipoMovimiento tipoMovimiento;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "estado_transaccion_id")
    private EstadoTransaccion estadoTransaccion;

    @ManyToOne
    @JoinColumn(name = "estado_registro_transaccion_id")
    private EstadoRegistroTransaccion estadoRegistroTransaccion;

}
