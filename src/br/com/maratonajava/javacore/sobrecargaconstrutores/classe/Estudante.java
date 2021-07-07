package br.com.maratonajava.javacore.sobrecargaconstrutores.classe;

public class Estudante {
    private String nome;
    private String matricula;
    private double[] notas;
    private String dataMatricula;

    public Estudante(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public Estudante(String nome, String matricula, double[] notas, String dataMatricula) {
        this(nome, matricula, notas);
        this.dataMatricula = dataMatricula;
    }

    public Estudante() {

    }

    public void print() {
        System.out.println("Data: " + dataMatricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        for (double nota : notas) {
            System.out.println("Notas: " + nota + "");
        }
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public double[] getNotas() {
        return this.notas;
    }

}