package com.security.securityauth.validador.senha;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class SenhaServiceImpl implements ISenhaService{
    @Override
    public String criptografarSenha(String senha) {
        return BCrypt.hashpw(senha, BCrypt.gensalt());
    }
}
