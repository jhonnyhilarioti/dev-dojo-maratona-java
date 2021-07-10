package br.com.maratonajava.javacore.modificadorstatico.test;

import br.com.maratonajava.javacore.modificadorstatico.classes.Carro2;

public class CarroTest2 {
    public static void main(String[] args) {
        Carro2.setvLimite(220);
        Carro2 c1 = new Carro2("BMW",290 );
        Carro2 c2 = new Carro2("Mercedes",270);
        Carro2 c3 = new Carro2("Audi",280);
        c1.print();
        c2.print();
        c3.print();
        System.out.println("############################");
        Carro2.setvLimite(250);
        c1.print();
        c2.print();
        c3.print();

    }
}
