package br.com.maratonajava.javacore.assertivas.classes;

public class Test {

    public void calculaSalario(double salario) {
        if (salario > 0) {
            salario = salario + (salario * 0.2);
        } else {
            System.out.println("O sálario não pode ser menor do que zero");
        }
    }

    public void calculSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException();
        }
    }

    public void calcSalario(double salario) {
        assert (salario > 0) : "O salario não pode ser menor do que zero!";
    }

    public void diaDaSemana(int dia) {
        switch (dia) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                assert false;
        }
    }
}