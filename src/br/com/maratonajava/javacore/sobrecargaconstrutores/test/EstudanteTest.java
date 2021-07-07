package br.com.maratonajava.javacore.sobrecargaconstrutores.test;

import br.com.maratonajava.javacore.sobrecargaconstrutores.classe.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante
                ("Jhonny", "555", new double[]{9, 5, 10}, "16/09/2002");
        estudante.print();
    }
}