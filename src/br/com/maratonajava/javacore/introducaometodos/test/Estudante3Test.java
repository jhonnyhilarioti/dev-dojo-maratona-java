package br.com.maratonajava.javacore.introducaometodos.test;

import br.com.maratonajava.javacore.introducaometodos.classes.Estudante3;

public class Estudante3Test {
    public static void main(String[] args) {
        Estudante3 est = new Estudante3();
        est.setNome("Jhonny");
        est.setIdade(27);
        est.setNotas(new float[] {9,8,7});
        est.print();
        est.tirarMedia();
        System.out.println(est.getNome());
    }
}