package br.com.maratonajava.javacore.blocosdeinicializacao.test;

import br.com.maratonajava.javacore.blocosdeinicializacao.classe.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("Número de parcelas: ");
        for (int parcela : cliente.getParcelas()) {
            System.out.print(parcela + " ");
        }
    }
}
