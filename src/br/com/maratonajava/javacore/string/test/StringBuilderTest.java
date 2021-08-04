package br.com.maratonajava.javacore.string.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "frase comum";
        StringBuilder sb = new StringBuilder(16);
        s = s.concat(" test");
        System.out.println(s);
        sb.append("Uma Stringbuilder");
        sb.append(" test");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.delete(0, 2));
        System.out.println(sb.insert(2, "###"));
        sb.append("def").insert(3, "ghi").reverse().delete(2, 4);
        System.out.println(sb);

        StringBuilder str = new StringBuilder("amroot");
        System.out.println("String = " + str);
        char[] cArr = new char[]{'a', 'd', 'm', 'i', 'n', 'i', 's', 't', 'r', 'a', 't', 'o', 'r'};
        str.append(cArr, 0, 5);
        System.out.println("After append = " + str);
        System.out.println(str.capacity());
    }
}