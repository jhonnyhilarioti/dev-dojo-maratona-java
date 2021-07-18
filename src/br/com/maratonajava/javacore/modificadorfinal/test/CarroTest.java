package br.com.maratonajava.javacore.modificadorfinal.test;

import br.com.maratonajava.javacore.modificadorfinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.getComprador().setNome("Jhonny Hilário");
        carro.setNome("GTX");
        carro.setMarca("Mercedes");
        System.out.println(carro);
        System.out.println(carro.getComprador());
    }
}
