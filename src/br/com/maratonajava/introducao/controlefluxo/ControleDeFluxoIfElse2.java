package br.com.maratonajava.introducao.controlefluxo;

public class ControleDeFluxoIfElse2 {
    public static void main(String[] args) {
        int idade = 15;
        String status;
        status = idade < 15 ? "Infantil" : idade>= 15 && idade< 18 ? "Juvenil" : "adulto" ;
        System.out.println(status);
    }
}
