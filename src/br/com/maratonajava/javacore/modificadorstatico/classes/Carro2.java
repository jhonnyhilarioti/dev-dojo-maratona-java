package br.com.maratonajava.javacore.modificadorstatico.classes;

public class Carro2 {
    private String nome;
    private int vMaxima;
    private static int vLimite = 240;

    public Carro2(String nome, int vMaxima){
        this.nome = nome;
        this.vMaxima = vMaxima;

    }
    public Carro2(){

    }
    public void print(){
        System.out.println("------------------------------");
        System.out.println(this.nome);
        System.out.println("Maxima: "+this.vMaxima);
        System.out.println("Limite: "+vLimite);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setvMaxima(int vMaxima){
        this.vMaxima = vMaxima;
    }
    public int getvMaxima(){
        return this.vMaxima;
    }
    public static void setvLimite(int vLimite) {
        Carro2.vLimite = vLimite;
    }
    public static int getvLimite(){
        return Carro2.vLimite;
    }
}
