package br.com.maratonajava.javacore.modificadorstatico.classes;

public class Carro {
    private String nome;
    private int velocidadeMaxima;
    public static int velocidadeLimite = 240;

    public Carro(String nome, int velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void print() {
        System.out.println("-------------------------------");
        System.out.println(this.nome);
        System.out.println("maximo: " + this.velocidadeMaxima);
        System.out.println("limite: " + velocidadeLimite);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return this.nome;
    }

    public int getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }
}
