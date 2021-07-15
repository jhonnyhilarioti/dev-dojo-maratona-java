package br.com.maratonajava.javacore.heranca.classes;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public void print() {
        System.out.println("#############################");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Bairro: " + this.endereco.getBairro());
        System.out.println("Rua: " + this.endereco.getRua());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }
}