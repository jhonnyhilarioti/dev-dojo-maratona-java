package br.com.maratonajava.javacore.introducaometodos.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprime(Professor aux) {
        System.out.println("----------------------------------");
        System.out.println(aux.nome);
        System.out.println(aux.cpf);
        System.out.println(aux.rg);
        System.out.println(aux.matricula);
    }
}
