package br.com.maratonajava.javacore.sobrecargametodos.test;

import br.com.maratonajava.javacore.sobrecargametodos.classe.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.init("Jhonny "," 555444-3 ",4500,"123456-7");
        funcionario.print();

    }
}
