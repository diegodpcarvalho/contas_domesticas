package com.gestao_contas_domestica.controlefinanceiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    @GetMapping
    public String dashboard(Model model) {
        // Aqui você pode adicionar dados ao model se necessário
        return "dashboard"; // Nome do arquivo HTML a ser renderizado
    }
}
