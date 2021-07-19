package br.com.maratonajava.javacore.enumeracao.classes;

public class Cliente3 {
    public enum TipoPagamento {
        AVISTA, APRAZO;
    }

    private String nome;
    private TipoCliente3 tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente3(String nome, TipoCliente3 tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente3{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNome() +
                ", tipoPagamento=" + tipoPagamento +
                ", Numero do Cliente " + tipoCliente.getTipo() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente3 getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente3 tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}