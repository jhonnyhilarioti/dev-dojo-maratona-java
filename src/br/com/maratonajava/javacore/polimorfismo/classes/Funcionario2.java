package br.com.maratonajava.javacore.polimorfismo.classes;

public abstract class Funcionario2 {
    protected String nome;
    protected double salario;

    public Funcionario2(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String toString() {
        return "Nome: " + nome + " Salário: " + salario;
    }

    public abstract void calculaSalario();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
}