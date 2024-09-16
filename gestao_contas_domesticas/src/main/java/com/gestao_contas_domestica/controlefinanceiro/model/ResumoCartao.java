package com.gestao_contas_domestica.controlefinanceiro.model;

public class ResumoCartao {
    private String cartao;
    private double limiteTotal;
    private double limiteDisponivel;
    private double totalComprasAbertas;

    // Getters e Setters
    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public double getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    public double getTotalComprasAbertas() {
        return totalComprasAbertas;
    }

    public void setTotalComprasAbertas(double totalComprasAbertas) {
        this.totalComprasAbertas = totalComprasAbertas;
    }
}
