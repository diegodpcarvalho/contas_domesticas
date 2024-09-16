package com.gestao_contas_domestica.controlefinanceiro.service;

import com.gestao_contas_domestica.controlefinanceiro.model.ContaReceber;
import com.gestao_contas_domestica.controlefinanceiro.repository.ContaReceberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaReceberService {

    @Autowired
    private ContaReceberRepository contaReceberRepository;

    /*
    public List<ContaReceber> listarTodasContas() {

        return contaReceberRepository.findAll();
    }
*/

    public List<ContaReceber> listarTodasContas(Long id) {

        return contaReceberRepository.findByUsuarioId(id);
    }


    public ContaReceber criarContaReceber(ContaReceber contaReceber) {
        return contaReceberRepository.save(contaReceber);
    }

    // Metodo para marcar uma conta como recebida
    public ContaReceber marcarComoRecebido(Long id) {
        ContaReceber conta = contaReceberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Conta não encontrada"));
        conta.setStatus("Recebido");
        return contaReceberRepository.save(conta);
    }

}
