package br.com.maratonajava.javacore.polimorfismo.classes;

public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public void calculaSalario() {
        this.salario = this.salario + totalVendas * 0.05;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
}