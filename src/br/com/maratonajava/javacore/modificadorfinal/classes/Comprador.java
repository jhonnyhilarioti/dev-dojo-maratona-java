package br.com.maratonajava.javacore.modificadorfinal.classes;

public class Comprador {
    private String nome;

    public String toString() {
        return " Comprador: " + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
