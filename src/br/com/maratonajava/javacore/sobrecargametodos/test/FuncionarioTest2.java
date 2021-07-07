package br.com.maratonajava.javacore.sobrecargametodos.test;

import br.com.maratonajava.javacore.sobrecargametodos.classe.Funcionario2;

public class FuncionarioTest2 {
    public static void main(String[] args) {
        Funcionario2 funcionario = new Funcionario2("Jhonny", "885522", 4500, "555444-8");
        Funcionario2 funcionario2 = new Funcionario2();
        funcionario.print();
        funcionario2.print();
        System.out.println(funcionario.getNome());
    }
}
