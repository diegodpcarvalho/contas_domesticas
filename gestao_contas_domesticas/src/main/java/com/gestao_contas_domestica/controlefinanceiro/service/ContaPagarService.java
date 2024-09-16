package com.gestao_contas_domestica.controlefinanceiro.service;

import com.gestao_contas_domestica.controlefinanceiro.model.ContaPagar;
import com.gestao_contas_domestica.controlefinanceiro.repository.ContaPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaPagarService {

    @Autowired
    private ContaPagarRepository contaPagarRepository;

    /*
    public List<ContaPagar> listarTodasContas() {
        return contaPagarRepository.findAll();
    }
*/


    public List<ContaPagar> listarTodasContas(Long id) {
        return contaPagarRepository.findByUsuarioId(id);
    }


    public ContaPagar criarContaPagar(ContaPagar contaPagar) {
        return contaPagarRepository.save(contaPagar);
    }

    public ContaPagar marcarComoPago(Long id) {
        ContaPagar conta = contaPagarRepository.findById(id).orElseThrow(() -> new RuntimeException("Conta não encontrada"));
        conta.setStatus("Pago");
        return contaPagarRepository.save(conta);
    }
}
