package com.gestao_contas_domestica.controlefinanceiro.repository;

import com.gestao_contas_domestica.controlefinanceiro.model.CompraCartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CompraCartaoRepository extends JpaRepository<CompraCartao, Long> {

    List<CompraCartao> findByUsuarioId(Long userId);

    // Consulta para calcular o total de compras em aberto por cartão
    @Query("SELECT SUM(c.valor) FROM CompraCartao c WHERE c.cartaoUtilizado = :cartaoUtilizado AND c.status = 'Pendente'")
    Double calcularTotalComprasAbertasPorCartao(String cartaoUtilizado);
}
