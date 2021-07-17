package br.com.maratonajava.javacore.heranca.classes;

public class Funcionario3 extends Pessoa3 {
    private double salario;

    public Funcionario3(String nome) {
        super(nome);
    }

    public void print() {
        super.print();
        System.out.println("Salario: " + this.salario);
        imprimeReciboSalario();
    }

    public void imprimeReciboSalario() {
        System.out.println("Eu " + super.nome + " recebi o salario de " + this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
}
