package br.com.maratonajava.javacore.sobrescrita.classes;

public class Pessoa extends Object {
    private String nome;
    private int idade;

    @Override
    public String toString(){
        return "Nome: "+nome+ "/ Idade: "+idade;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }
}
