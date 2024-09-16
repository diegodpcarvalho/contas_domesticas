package com.gestao_contas_domestica.controlefinanceiro.service;

import com.gestao_contas_domestica.controlefinanceiro.model.CompraCartao;
import com.gestao_contas_domestica.controlefinanceiro.repository.CompraCartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraCartaoService {

    @Autowired
    private CompraCartaoRepository compraCartaoRepository;
/*
    public List<CompraCartao> listarTodasCompras() {
        return compraCartaoRepository.findAll();
    }
*/

    public List<CompraCartao> listarTodasCompras(Long id) {
        return compraCartaoRepository.findByUsuarioId(id);
    }


    public CompraCartao criarCompraCartao(CompraCartao compraCartao) {
        return compraCartaoRepository.save(compraCartao);
    }
}
