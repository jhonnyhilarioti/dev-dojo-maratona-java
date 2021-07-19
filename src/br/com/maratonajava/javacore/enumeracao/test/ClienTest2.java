package br.com.maratonajava.javacore.enumeracao.test;

import br.com.maratonajava.javacore.enumeracao.classes.Cliente2;
import br.com.maratonajava.javacore.enumeracao.classes.TipoCliente2;

public class ClienTest2 {
    public static void main(String[] args) {
        Cliente2 cliente = new Cliente2("Jhonny Hilário", TipoCliente2.PESSOA_FISICA, Cliente2.TipoPagamento.APRAZO);
        System.out.println(cliente);
    }
}