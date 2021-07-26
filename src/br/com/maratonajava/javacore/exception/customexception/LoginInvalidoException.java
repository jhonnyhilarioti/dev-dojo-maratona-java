package br.com.maratonajava.javacore.exception.customexception;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Usuário ou Senha Inválidos");
    }
}