package com.gestao_contas_domestica.controlefinanceiro.controller;

import com.gestao_contas_domestica.controlefinanceiro.model.ContaPagar;
import com.gestao_contas_domestica.controlefinanceiro.repository.ContaPagarRepository;
import com.gestao_contas_domestica.controlefinanceiro.service.ContaPagarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contas-pagar")
public class ContaPagarController {

    @Autowired
    private ContaPagarService contaPagarService;
    private ContaPagarRepository contaPagarRepository;
    
    /*
    @GetMapping
    public List<ContaPagar> listarContasPagar() {

        return contaPagarService.listarTodasContas();
    }
*/

    @GetMapping("/{id}")
    public List<ContaPagar> listarContasPagar(@PathVariable Long id) {

    return contaPagarService.listarTodasContas(id);
    }

    @PostMapping
    public ContaPagar criarContaPagar(@RequestBody ContaPagar contaPagar) {
        return contaPagarService.criarContaPagar(contaPagar);
    }

    @PutMapping("/{id}/pago")
    public ContaPagar marcarComoPago(@PathVariable Long id) {
        return contaPagarService.marcarComoPago(id);
    }
}
