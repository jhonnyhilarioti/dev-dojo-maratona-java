package br.com.maratonajava.javacore.polimorfismo.classes;

public class RelatorioPagamento2 {

    public void relatorioPagamento(Funcionario2 funcionario) {
        System.out.println("Relatório de Pagamento");
        funcionario.calculaSalario();
        System.out.println("Nome = " + funcionario.getNome());
        System.out.println("Salário = " + funcionario.getSalario());
        if (funcionario instanceof Gerente2) {
//            Gerente2 gerente = (Gerente2) funcionario;
            System.out.println("Participação nos lucros = " + ((Gerente2) funcionario).getPnl());
        }
        if (funcionario instanceof Vendedor2) {
            //            Vendedor2 vendedor = (Vendedor2) funcionario;
            System.out.println("Total de Vendas = " + ((Vendedor2) funcionario).getVendas());
        }
    }
}