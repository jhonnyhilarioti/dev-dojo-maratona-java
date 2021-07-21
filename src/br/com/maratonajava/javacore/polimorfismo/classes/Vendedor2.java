package br.com.maratonajava.javacore.polimorfismo.classes;

public class Vendedor2 extends Funcionario2 {
    private double vendas;

    public Vendedor2(String nome, double salario, double vendas) {
        super(nome, salario);
        this.vendas = vendas;
    }

    @Override
    public void calculaSalario() {
        this.salario = this.salario + (vendas * 0.05);
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getVendas() {
        return this.vendas;
    }
}