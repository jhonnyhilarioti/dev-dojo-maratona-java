package br.com.maratonajava.javacore.introducaometodos.classes;

import java.util.Scanner;

public class Estudante {
    public String nome;
    public int idade;
    public float[] notas;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if(notas != null) {
            for (float nota : notas) {
                System.out.print(nota);
            }
        }
    }

    public void tirarMedia() {
        if(notas == null){
            System.out.println("Esse aluno não possui notas");
            return;
        }
        float media = 0;
        for (float nota : notas) {
            media += nota;
        }
        media = media / notas.length;
        if (media > 6) {
            System.out.println("\nA média é: "+media+ " Situação: Aprovado!");
            return;
        }
        System.out.println("\nA média é: "+media+ " Situação: Reprovado!");
    }
}
