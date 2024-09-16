package com.gestao_contas_domestica.controlefinanceiro.repository;

import com.gestao_contas_domestica.controlefinanceiro.model.ContaPagar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContaPagarRepository extends JpaRepository<ContaPagar, Long> {
    List<ContaPagar> findAllById(Long id);
    List<ContaPagar> findByUsuarioId(Long userId);
}
