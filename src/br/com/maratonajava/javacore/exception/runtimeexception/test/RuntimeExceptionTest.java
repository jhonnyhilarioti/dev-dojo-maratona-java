package br.com.maratonajava.javacore.exception.runtimeexception.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        if (b != 0) {
            int c = a / b;
            System.out.println(c);
        }
    }
}