package com.gestao_contas_domestica.controlefinanceiro.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "compras_cartao")
public class CompraCartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private String descricao;
    private Double valor;
    private String dataCompra;
    private String categoria;
    private String cartaoUtilizado;
    private Integer parcelas;

    // Adicionando o status da compra (Pendente ou Pago)
    private String status;
}
