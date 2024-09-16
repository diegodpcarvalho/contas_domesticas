package com.gestao_contas_domestica.controlefinanceiro.repository;

import com.gestao_contas_domestica.controlefinanceiro.model.ContaPagar;
import com.gestao_contas_domestica.controlefinanceiro.model.ContaReceber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContaReceberRepository extends JpaRepository<ContaReceber, Long> {
    List<ContaReceber> findByUsuarioId(Long userId);

}
