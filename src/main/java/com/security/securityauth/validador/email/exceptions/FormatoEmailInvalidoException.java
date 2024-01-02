package com.security.securityauth.validador.email.exceptions;

/**
 * Exception para formato de email inválido
 */
public class FormatoEmailInvalidoException extends Exception {
    public FormatoEmailInvalidoException(String mensagem) {
        super(mensagem);
    }
}
