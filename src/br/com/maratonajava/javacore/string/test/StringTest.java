package br.com.maratonajava.javacore.string.test;

public class StringTest {
    public static void main(String[] args) {
        //Strings são imutáveis
        String nome  = "Jhonny";
        nome = nome.concat(" Hilário");
//        nome += "Hilário";
        String nome2 = "jhonny";
        System.out.println(nome);
        System.out.println("#######################");

        String test = "Goku";
        String test2 = "   0123456789   ";
        System.out.println(test.charAt(0));
        System.out.println(test.equals(test2));
        System.out.println(test.equalsIgnoreCase(test2));
        System.out.println(test.length());
        System.out.println(test.replace('o', 'a'));
        System.out.println(test.toLowerCase());
        System.out.println(test.toUpperCase());
        System.out.println(test2.substring(0,2));
        System.out.println(test2.trim());
    }
}