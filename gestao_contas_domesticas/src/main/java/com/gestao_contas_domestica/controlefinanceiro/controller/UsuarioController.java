package com.gestao_contas_domestica.controlefinanceiro.controller;

import com.gestao_contas_domestica.controlefinanceiro.model.Usuario;
import com.gestao_contas_domestica.controlefinanceiro.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarTodosUsuarios();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.criarUsuario(usuario);
    }

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario usuario) {
        // Verificar credenciais
        Usuario autenticado = usuarioService.autenticar(usuario.getEmail(), usuario.getSenhaHash());
        if (autenticado != null) {
            return autenticado;  // Retorna o usuário autenticado (com ID)
        } else {
            throw new RuntimeException("Credenciais inválidas");
        }
    }
}
