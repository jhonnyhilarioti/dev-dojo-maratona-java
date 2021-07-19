package br.com.maratonajava.javacore.enumeracao.test;

import br.com.maratonajava.javacore.enumeracao.classes.Cliente3;
import br.com.maratonajava.javacore.enumeracao.classes.TipoCliente3;

public class ClienteTest3 {
    public static void main(String[] args) {
        Cliente3 cliente = new Cliente3("Jhonny Hilário", TipoCliente3.PESSOA_JURIDICA, Cliente3.TipoPagamento.APRAZO);
        System.out.println(TipoCliente3.PESSOA_JURIDICA.getTipoId());
        System.out.println(TipoCliente3.PESSOA_FISICA.getTipoId());
        System.out.println(cliente);
    }
}