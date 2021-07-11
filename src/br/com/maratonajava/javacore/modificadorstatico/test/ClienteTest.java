package br.com.maratonajava.javacore.modificadorstatico.test;

import br.com.maratonajava.javacore.modificadorstatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        System.out.println("Números de parcelas!");
        System.out.println("Parcelas: " + Cliente.getParcelas().length);
    }
}
