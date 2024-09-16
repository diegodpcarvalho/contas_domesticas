package com.gestao_contas_domestica.controlefinanceiro.service;

import com.gestao_contas_domestica.controlefinanceiro.model.ResumoCartao;
import com.gestao_contas_domestica.controlefinanceiro.repository.CompraCartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartaoService {

    @Autowired
    private CompraCartaoRepository compraCartaoRepository;

    public List<ResumoCartao> calcularResumoCartoes() {
        List<ResumoCartao> resumoCartoes = new ArrayList<>();

        // Lista de cartões que você deseja monitorar
        String[] cartoes = {"Visa", "Mastercard", "Amex"};
        double limiteTotal = 5000.00;  // Limite fixo de exemplo para cada cartão

        for (String cartao : cartoes) {
            Double totalComprasAbertas = compraCartaoRepository.calcularTotalComprasAbertasPorCartao(cartao);
            if (totalComprasAbertas == null) {
                totalComprasAbertas = 0.0;  // Se não houver compras, total será 0
            }

            ResumoCartao resumoCartao = new ResumoCartao();
            resumoCartao.setCartao(cartao);
            resumoCartao.setLimiteTotal(limiteTotal);
            resumoCartao.setTotalComprasAbertas(totalComprasAbertas);
            resumoCartao.setLimiteDisponivel(limiteTotal - totalComprasAbertas);

            resumoCartoes.add(resumoCartao);
        }

        return resumoCartoes;
    }
}
