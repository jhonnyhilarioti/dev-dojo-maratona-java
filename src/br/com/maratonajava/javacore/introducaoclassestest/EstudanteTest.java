package br.com.maratonajava.javacore.introducaoclassestest;

import br.com.maratonajava.javacore.introducaoclasses.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.nome = "João";
        joao.matricula = "1212";
        joao.idade  = "26";
        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);
    }
}
