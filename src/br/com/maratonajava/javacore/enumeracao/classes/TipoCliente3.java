package br.com.maratonajava.javacore.enumeracao.classes;

public enum TipoCliente3 {
    // constant specific class body
    // corpo especifico de classe constante

    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica") {
        public String getTipoId() {
            return "B";
        }
    };

    private int tipo;
    private String nome;

    TipoCliente3(int tipo, String nome) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getTipoId() {
        return "A";
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}