package com.security.securityauth.validador.senha;

public interface ISenhaValidador {

    void validar(String senha, String hashedSenha);
}
