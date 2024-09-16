package com.gestao_contas_domestica.controlefinanceiro.repository;

import com.gestao_contas_domestica.controlefinanceiro.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Metodo para encontrar o usuário por e-mail e senha (usando senhaHash)
    Usuario findByEmailAndSenhaHash(String email, String senhaHash);
}
