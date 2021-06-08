package br.com.maratonajava.javacore.introducaometodos.test;

import br.com.maratonajava.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Lenadro";
        prof.rg = "555-555-5";
        prof.cpf = "333-333-3";
        prof.matricula = "192837";

        Professor prof2 = new Professor();
        prof2.nome = "Jhonny";
        prof2.rg = "111-111-1";
        prof2.cpf = "222-222-2";
        prof2.matricula = "918273";

        prof.imprime(prof);
        prof.imprime(prof2);


    }
}
