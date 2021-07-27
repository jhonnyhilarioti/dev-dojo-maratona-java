package br.com.maratonajava.javacore.exception.checkedexception.test;

import br.com.maratonajava.javacore.exception.checkedexception.classes.Funcionario;
import br.com.maratonajava.javacore.exception.checkedexception.classes.Pessoa;
import br.com.maratonajava.javacore.exception.customexception.LoginInvalidoException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SobrescritaComExceptionTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
        } catch (LoginInvalidoException | IOException e) {
            e.printStackTrace();
        }

        try {
            funcionario.salvar();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}