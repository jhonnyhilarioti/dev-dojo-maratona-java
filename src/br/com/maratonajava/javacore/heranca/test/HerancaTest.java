package br.com.maratonajava.javacore.heranca.test;

import br.com.maratonajava.javacore.heranca.classes.Endereco;
import br.com.maratonajava.javacore.heranca.classes.Funcionario;
import br.com.maratonajava.javacore.heranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Endereco endereco = new Endereco();
        Endereco endereco2 = new Endereco();
        Funcionario funcionario = new Funcionario();

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