package com.gestao_contas_domestica.controlefinanceiro.controller;

import com.gestao_contas_domestica.controlefinanceiro.model.ContaReceber;
import com.gestao_contas_domestica.controlefinanceiro.service.ContaReceberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contas-receber")
public class ContaReceberController {

    @Autowired
    private ContaReceberService contaReceberService;
/*
    @GetMapping
    public List<ContaReceber> listarContasReceber() {
        return contaReceberService.listarTodasContas();
    }
*/

    @GetMapping("/{id}")
    public List<ContaReceber> listarContasReceber(@PathVariable Long id) {
        return contaReceberService.listarTodasContas(id);
    }


    @PostMapping
    public ContaReceber criarContaReceber(@RequestBody ContaReceber contaReceber) {
        return contaReceberService.criarContaReceber(contaReceber);
    }

    @PutMapping("/{id}/recebido")
    public ContaReceber marcarComoRecebido(@PathVariable Long id) {
        return contaReceberService.marcarComoRecebido(id);
    }


}
