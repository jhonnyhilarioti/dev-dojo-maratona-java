package br.com.maratonajava.javacore.heranca.classes;

public class Funcionario2 extends Pessoa2 {
    private double salario;

    public void print() {
        super.print();
        System.out.println("Salario: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + super.nome + " recebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}