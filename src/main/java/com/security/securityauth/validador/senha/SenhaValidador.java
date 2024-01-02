package com.security.securityauth.validador.senha;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class SenhaValidador implements ISenhaValidador {

    @Override
    public void validar(String senha, String hashedSenha) {
        if(!BCrypt.checkpw(senha, hashedSenha)){
            throw new BadCredentialsException("Senha incorreta. Por favor, verifique.");
        }
    }

}
