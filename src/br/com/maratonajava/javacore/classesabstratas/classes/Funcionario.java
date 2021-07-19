package br.com.maratonajava.javacore.classesabstratas.classes;

public abstract class Funcionario {
    protected String nome;
    protected String clt;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    public String toString() {
        return " Nome: " + nome + " CLT: " + clt + " Salario: " + salario;
    }

    public abstract void calculaSalario();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public String getClt() {
        return this.clt;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
}