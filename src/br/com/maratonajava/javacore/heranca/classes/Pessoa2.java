package br.com.maratonajava.javacore.heranca.classes;

public class Pessoa2 {
    protected String nome;
    protected String cpf;
    protected Endereco2 endereco;

    public void print() {
        System.out.println("#########################");
        System.out.println("nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Bairro: " + this.endereco.getBairro());
        System.out.println("Rua: " + this.endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco2 getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco2 endereco) {
        this.endereco = endereco;
    }
}
