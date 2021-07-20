package br.com.maratonajava.javacore.interfaces.test;

import br.com.maratonajava.javacore.interfaces.classes.Produto;

public class InterfacesTest {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2, 3000);
        produto.calculaImposto();
        produto.calculaFrete();
        System.out.println(produto);
    }
}