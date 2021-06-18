package br.com.maratonajava.javacore.introducaometodos.test;

import br.com.maratonajava.javacore.introducaometodos.classes.CalculadoraVarargs;

public class CalculadoraVarargsTest {
    public static void main(String[] args) {
        CalculadoraVarargs calcVarargs = new CalculadoraVarargs();

        int[] numeros = new int[] {1,2,3,4,5};
        calcVarargs.somaArrays(numeros);
        calcVarargs.somaVarargs(1,2,3,4,8);
    }


}
