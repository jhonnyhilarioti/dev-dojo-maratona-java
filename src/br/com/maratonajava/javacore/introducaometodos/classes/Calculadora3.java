package br.com.maratonajava.javacore.introducaometodos.classes;

public class Calculadora3 {
    public void imprimindoDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Não é possivel dividir por zero");

    }
}
