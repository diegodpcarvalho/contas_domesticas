package com.gestao_contas_domestica.controlefinanceiro.service;

import com.gestao_contas_domestica.controlefinanceiro.model.Usuario;
import com.gestao_contas_domestica.controlefinanceiro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Metodo de autenticação sem hash por enquanto
    public Usuario autenticar(String email, String senha) {
        // Estamos usando senhaHash para armazenar a senha diretamente
        return usuarioRepository.findByEmailAndSenhaHash(email, senha);
    }
}
