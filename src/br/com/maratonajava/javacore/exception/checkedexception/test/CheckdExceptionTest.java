package br.com.maratonajava.javacore.exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckdExceptionTest {
    public static void main(String[] args) {
        criarArquivo();
    }

    public static void criarArquivo() {
        File file = new File("Teste.txt");
        try {
            System.out.println("Arquivo criado ? " + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}