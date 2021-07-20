package br.com.maratonajava.javacore.interfaces.classes;

public class Produto implements Tributavel, Transportavel {
    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double precoFrete;

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", preco=" + preco +
                ", precoFinal=" + precoFinal +
                ", precoFrete=" + precoFrete +
                '}';
    }

    @Override
    public void calculaImposto() {
        precoFinal = this.preco + (this.preco * IMPOSTO);
    }

    @Override
    public void calculaFrete() {
        precoFrete = preco / peso * 0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}