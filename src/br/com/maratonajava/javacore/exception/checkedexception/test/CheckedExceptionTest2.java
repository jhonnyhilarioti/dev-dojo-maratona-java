package br.com.maratonajava.javacore.exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest2 {
    public static void main(String[] args) {
        try{
            criarArquivo();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void criarArquivo() throws IOException{
        File file = new File("Teste.txt");
        try{
            System.out.println("Arquivo criado? "+file.createNewFile());
        }catch(IOException e){
            e.printStackTrace();
            throw e;
        }
    }

}