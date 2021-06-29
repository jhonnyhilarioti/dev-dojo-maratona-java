package br.com.maratonajava.javacore.introducaometodos.classes;

public class Estudante3 {
    private String nome;
    private int idade;
    private float[] notas;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (notas != null) {
            for (float nota : notas) {
                System.out.print(nota);
            }
        }
    }

    public void tirarMedia() {
        if (notas == null) {
            System.out.println("Esse aluno não possui notas");
            return;
        }
        float media = 0;
        for (float nota : notas) {
            media += nota;
        }
        media = media / notas.length;
        if (media > 6) {
            System.out.println("\nA média é: " + media + " Situação: Aprovado!");
            return;
        }
        System.out.println("\nA média é: " + media + " Situação: Reprovado!");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 0) {
            System.out.println("Você não pode fazer isso!");
            return;
        }
        this.idade = idade;
    }
    public void setNotas(float[] notas){
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public float[] getNotas(){
        return this.notas;
    }
}

