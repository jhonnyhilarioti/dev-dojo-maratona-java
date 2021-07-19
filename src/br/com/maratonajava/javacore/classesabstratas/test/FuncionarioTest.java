package br.com.maratonajava.javacore.classesabstratas.test;

import br.com.maratonajava.javacore.classesabstratas.classes.Funcionario;
import br.com.maratonajava.javacore.classesabstratas.classes.Gerente;
import br.com.maratonajava.javacore.classesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Marcos", "11100-8", 25000);
        Vendedor vendedor = new Vendedor("Jhonny","2506-7",10000,5000);
        vendedor.calculaSalario();
        gerente.calculaSalario();

        System.out.println(gerente);
        System.out.println("############################");
        System.out.println(vendedor);
    }
}