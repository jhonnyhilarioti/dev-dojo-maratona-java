package br.com.maratonajava.javacore.heranca.test;

import br.com.maratonajava.javacore.heranca.classes.Endereco2;
import br.com.maratonajava.javacore.heranca.classes.Funcionario2;
import br.com.maratonajava.javacore.heranca.classes.Pessoa2;

public class HerancaTest2 {
    public static void main(String[] args) {
        Pessoa2 pessoa = new Pessoa2();
        Endereco2 endereco = new Endereco2();
        Endereco2 endereco2 = new Endereco2();
        Funcionario2 funcionario = new Funcionario2();

        pessoa.setNome("Jhonny Hilário");
        pessoa.setCpf("888222-7");
        pessoa.setEndereco(endereco);

        endereco.setBairro("Monte Castelo");
        endereco.setRua("José Bressam");
        endereco2.setBairro("Deon");
        endereco2.setRua("Expedicionário");

        funcionario.setNome("João da silva");
        funcionario.setCpf("222666-8");
        funcionario.setEndereco(endereco2);
        funcionario.setSalario(15000);

        pessoa.print();
        funcionario.print();
    }
}
