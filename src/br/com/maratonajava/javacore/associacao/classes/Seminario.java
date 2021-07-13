package br.com.maratonajava.javacore.associacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {

    }

    public void print() {
        System.out.println("----------------Relatório do Seminário----------------");
        System.out.println("Título: " + this.titulo);
        if (professor != null) {
            System.out.println("Palestrante: " + this.professor.getNome());
        } else {
            System.out.println("Não a professor cadastrado nesse seminario");
        }
        if (local != null) {
            System.out.println("Bairro: " + this.local.getBairro());
            System.out.println("Rua: " + this.local.getRua());
        } else {
            System.out.println("Nenhum local cadastrado para esse seminario");
        }
        if (alunos != null && alunos.length != 0) {
            System.out.print("Aluno: ");
            for (Aluno alunos : alunos) {
                System.out.println(alunos.getNome());
            }
        } else {
            System.out.println("Nenhum aluno cadastrado");
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }
}
