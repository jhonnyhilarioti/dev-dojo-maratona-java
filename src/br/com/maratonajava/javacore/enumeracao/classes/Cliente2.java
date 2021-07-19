package br.com.maratonajava.javacore.enumeracao.classes;

public class Cliente2 {
    public enum TipoPagamento {
        AVISTA, APRAZO;
    }

    private String nome;
    private TipoCliente2 tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente2(String nome, TipoCliente2 tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return " Nome: " + nome + " Tipo de cliente: " + tipoCliente.getNome() + " Número tipo: " + tipoCliente.getTipo() + " Tipo de Pagamento: " + tipoPagamento;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente2 getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente2 tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}