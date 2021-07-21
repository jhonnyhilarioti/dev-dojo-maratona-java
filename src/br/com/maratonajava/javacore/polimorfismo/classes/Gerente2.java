package br.com.maratonajava.javacore.polimorfismo.classes;

public class Gerente2 extends Funcionario2 {
    private double pnl;

    public Gerente2(String nome, double salario, double pnl) {
        super(nome, salario);
        this.pnl = pnl;
    }

    @Override
    public void calculaSalario() {
        this.salario = this.salario + pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }

    public double getPnl() {
        return this.pnl;
    }

}