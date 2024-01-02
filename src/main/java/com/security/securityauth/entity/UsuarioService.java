package com.security.securityauth.entity;

import com.security.securityauth.dto.RegisterDTO;
import com.security.securityauth.validador.email.IValidadorEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Classe responsável por carregar os dados de acesso do usuário para efetuar a autenticação
 */
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private IValidadorEmail iValidadorEmail;

    public void create(RegisterDTO data) {
        iValidadorEmail.validar(data.email());
        String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
        final var newUser = new Usuario(data.email(), encryptedPassword, data.role());
        usuarioRepository.save(newUser);
    }

}
