package br.com.maratonajava.javacore.heranca.test;

import br.com.maratonajava.javacore.heranca.classes.Endereco3;
import br.com.maratonajava.javacore.heranca.classes.Funcionario3;
import br.com.maratonajava.javacore.heranca.classes.Pessoa3;

public class HerancaTest3 {
    public static void main(String[] args) {
        Pessoa3 pessoa = new Pessoa3("Jhonny Hilário");
        Endereco3 endereco = new Endereco3();
        Funcionario3 funcionario = new Funcionario3("João da silva");

        endereco.setBairro("Deon");
        endereco.setRua("Expedicionário");
        pessoa.setCpf("123456-7");
        pessoa.setEndereco(endereco);
        funcionario.setCpf("789456-1");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(15000);

        pessoa.print();
        funcionario.print();
    }
}