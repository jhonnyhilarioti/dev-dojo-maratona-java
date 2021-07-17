package br.com.maratonajava.javacore.sobrescrita.test;

import br.com.maratonajava.javacore.sobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] rags){
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jhonny Hilário");
        pessoa.setIdade(27);

        System.out.println(pessoa);
    }
}
