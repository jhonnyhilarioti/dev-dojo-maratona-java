package br.com.maratonajava.javacore.introducaoclasses.test;

import br.com.maratonajava.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Leandro";
        professor.matricula = "12152034-8";
        professor.rg = "196.353.248-84";
        professor.cpf = "2239574";
        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.cpf);
        System.out.println(professor.rg);
    }
}
