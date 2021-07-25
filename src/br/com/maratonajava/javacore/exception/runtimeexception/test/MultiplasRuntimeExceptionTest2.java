package br.com.maratonajava.javacore.exception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest2 {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException("Lançando Multiplas exception!");
        } catch (IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            e.getMessage();
            e.printStackTrace();
        }
        try {
            talvezLanceException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void talvezLanceException() throws SQLException, FileNotFoundException {
    }
}