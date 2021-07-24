package br.com.maratonajava.javacore.exception.runtimeexception.test;

import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro de RuntimeException");
        }
        System.out.println("Final do progarama!");

        try {
            podeLancarException();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void podeLancarException() throws IOException, SQLException {

    }
}