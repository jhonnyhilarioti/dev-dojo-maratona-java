package br.com.maratonajava.javacore.modificadorstatico.test;

import br.com.maratonajava.javacore.modificadorstatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.velocidadeLimite = 220;
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        c1.print();
        c2.print();
        c3.print();

        System.out.println("##############################");

        Carro.velocidadeLimite = 280;

        c1.print();
        c2.print();
        c3.print();
    }
}
