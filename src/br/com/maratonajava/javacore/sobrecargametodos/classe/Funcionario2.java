package br.com.maratonajava.javacore.sobrecargametodos.classe;

public class Funcionario2 {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    public Funcionario2(String nome, String cpf, double salario, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
        System.out.println("Dentro do construtor!");
    }

    public Funcionario2() {


    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getRg() {
        return this.rg;
    }

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salario: " + this.salario);
        System.out.println("RG: " + this.rg);
    }
}
