package com.pedidos.pedidos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PEDIDO")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @JoinColumn(name = "ID_CLIENTE")
    @ManyToOne
    private Cliente cliente;

    @Column(name = "DATA_PEDIDO")
    private Timestamp data_pedido;

    @Column(name = "TOTAL", precision = 20, scale = 2)
    private BigDecimal total;

    @Column(name = "NUMERO_CONTROLE")
    private Integer numero_controle;

}
