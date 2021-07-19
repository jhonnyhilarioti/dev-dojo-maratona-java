package br.com.maratonajava.javacore.enumeracao.classes;

public enum TipoCliente2 {
    PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juídica");

    private int tipo;
    private String nome;

    TipoCliente2(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getTipo() {
        return this.tipo;
    }
}