package br.com.maratonajava.javacore.modificadorfinal.classes;

public class Carro {
    private static final double VELOCIDADE_LIMITE = 240;
    private final Comprador COMPRADOR = new Comprador();
    private String nome;
    private String marca;

    @Override
    public String toString() {
        return " Nome: " + nome + "\n Marca: " + marca;
    }

    public Comprador getComprador() {
        return COMPRADOR;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }
}
