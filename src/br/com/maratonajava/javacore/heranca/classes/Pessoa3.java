package br.com.maratonajava.javacore.heranca.classes;

public class Pessoa3 {
    protected String nome;
    protected String cpf;
    protected Endereco3 endereco;

    public Pessoa3(String nome) {
        this.nome = nome;
    }

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

    public void setEndereco(Endereco3 endereco) {
        this.endereco = endereco;
    }

    public Endereco3 getEndereco() {
        return this.endereco;
    }
}