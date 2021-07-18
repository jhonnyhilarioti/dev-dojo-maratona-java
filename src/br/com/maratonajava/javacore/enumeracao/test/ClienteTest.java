package br.com.maratonajava.javacore.enumeracao.test;

import br.com.maratonajava.javacore.enumeracao.classes.Cliente;
import br.com.maratonajava.javacore.enumeracao.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jhonny Hilário", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente);

    }
}