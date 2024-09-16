package com.gestao_contas_domestica.controlefinanceiro.controller;

import com.gestao_contas_domestica.controlefinanceiro.model.CompraCartao;
import com.gestao_contas_domestica.controlefinanceiro.service.CompraCartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras-cartao")
public class CompraCartaoController {

    @Autowired
    private CompraCartaoService compraCartaoService;
/*
    @GetMapping
    public List<CompraCartao> listarComprasCartao() {

        return compraCartaoService.listarTodasCompras();
    }
*/

    @GetMapping("/{id}")
    public List<CompraCartao> listarComprasCartao(@PathVariable Long id) {

        return compraCartaoService.listarTodasCompras(id);
    }

    @PostMapping
    public CompraCartao criarCompraCartao(@RequestBody CompraCartao compraCartao) {
        return compraCartaoService.criarCompraCartao(compraCartao);
    }
}
