package br.com.maratonajava.javacore.polimorfismo.test;

import br.com.maratonajava.javacore.polimorfismo.classes.Gerente2;
import br.com.maratonajava.javacore.polimorfismo.classes.RelatorioPagamento2;
import br.com.maratonajava.javacore.polimorfismo.classes.Vendedor2;

public class FuncionarioTest2 {
    public static void main(String[] args) {
        Gerente2 gerente = new Gerente2("Yure", 5000, 1500);
        Vendedor2 vendedor = new Vendedor2("Maycon", 2500, 25000);
        RelatorioPagamento2 relatorio = new RelatorioPagamento2();

        relatorio.relatorioPagamento(gerente);
        System.out.println("###########################");
        relatorio.relatorioPagamento(vendedor);
    }
}