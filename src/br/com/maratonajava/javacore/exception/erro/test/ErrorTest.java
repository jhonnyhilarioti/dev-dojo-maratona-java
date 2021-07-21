package br.com.maratonajava.javacore.exception.erro.test;

public class ErrorTest {
    public static void main(String[] args){
        stackOverflowError();
    }
    public static void stackOverflowError(){
        stackOverflowError();
    }
}