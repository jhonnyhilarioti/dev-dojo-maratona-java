package br.com.maratonajava.javacore.introducaoclasses.test;

import br.com.maratonajava.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.placa = "MJK61020";
        carro.velocidadeMaxima = 300;
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima + " km/h");
    }
}
