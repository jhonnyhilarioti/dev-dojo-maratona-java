package br.com.maratonajava.javacore.associacao.test;

import br.com.maratonajava.javacore.associacao.classes.Aluno;
import br.com.maratonajava.javacore.associacao.classes.Local;
import br.com.maratonajava.javacore.associacao.classes.Professor;
import br.com.maratonajava.javacore.associacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Jhonny Hilário", 27);
        Aluno aluno2 = new Aluno("Yoda", 900);
        Seminario sem = new Seminario("Maratona java!");
        Professor prof = new Professor("Leandro Hilário", "POO Java");
        Local local = new Local("Deon", "Aroeiras");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);
        sem.setAlunos(new Aluno[]{aluno, aluno2});
        prof.setSeminarios(new Seminario[]{sem});
        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.print();
        aluno.print();
        aluno2.print();
        prof.print();
        local.print();
    }
}
