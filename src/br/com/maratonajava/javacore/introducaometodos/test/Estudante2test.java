package br.com.maratonajava.javacore.introducaometodos.test;

import br.com.maratonajava.javacore.introducaometodos.classes.Estudante2;

import java.util.Scanner;

public class Estudante2test {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Estudante2 estudante = new Estudante2();
        estudante.nome = "Jhonny";
        estudante.idade = 27;
        estudante.notas = new float[3];

        estudante.print();
        estudante.tirarMedia();

    }
}



