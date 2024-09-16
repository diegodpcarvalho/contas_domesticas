package com.gestao_contas_domestica.controlefinanceiro.controller;

import com.gestao_contas_domestica.controlefinanceiro.model.ResumoCartao;
import com.gestao_contas_domestica.controlefinanceiro.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/resumo-cartoes")
public class CartaoController {

    @Autowired
    private CartaoService cartaoService;

    @GetMapping
    public List<ResumoCartao> getResumoCartoes() {
        return cartaoService.calcularResumoCartoes();
    }
}
