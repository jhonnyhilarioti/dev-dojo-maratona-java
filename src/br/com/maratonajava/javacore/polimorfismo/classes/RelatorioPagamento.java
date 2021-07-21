package br.com.maratonajava.javacore.polimorfismo.classes;

public class RelatorioPagamento {
//    public void relatorioPagamentoGerente(Gerente gerente){
//        System.out.println("Relatório de pagamento da Geren");
//        gerente.calculaSalario();
//        System.out.println("Nome: "+gerente.getNome());
//        System.out.println("Salário: "+gerente.getSalario());
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor){
//        System.out.println("Relatório de pagamento de vendedores");
//        vendedor.calculaSalario();
//        System.out.println("Nome: "+vendedor.getNome());
//        System.out.println("Salário: "+vendedor.getSalario());
//    }

    public void relatorioPagamento(Funcionario funcionario) {
        System.out.println("Relatório de pagamento");
        funcionario.calculaSalario();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
    }
}