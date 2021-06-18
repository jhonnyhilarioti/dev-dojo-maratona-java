package br.com.maratonajava.javacore.introducaometodos.test;

import br.com.maratonajava.javacore.introducaometodos.classes.Estudante;

import java.util.Scanner;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante();
        est.nome = "Jhonny";
        est.idade = 27;
        est.notas = new float[] {9,8,7};
        est.print();
        est.tirarMedia();
    }
}
