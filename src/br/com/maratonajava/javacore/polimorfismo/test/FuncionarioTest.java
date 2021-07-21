package br.com.maratonajava.javacore.polimorfismo.test;

import br.com.maratonajava.javacore.polimorfismo.classes.Gerente;
import br.com.maratonajava.javacore.polimorfismo.classes.RelatorioPagamento;
import br.com.maratonajava.javacore.polimorfismo.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Yure", 5000, 1000);
        Vendedor vendedor = new Vendedor("Maycon", 2000, 20000);
        RelatorioPagamento relatorio = new RelatorioPagamento();

//        relatorio.relatorioPagamentoGerente(gerente);
//        relatorio.relatorioPagamentoVendedor(vendedor);

        relatorio.relatorioPagamento(gerente);
        System.out.println("######################");
        relatorio.relatorioPagamento(vendedor);
    }
}
