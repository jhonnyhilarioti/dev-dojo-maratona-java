package br.com.maratonajava.javacore.exception.checkedexception.test;

public class RuntimeExceptionTest3 {
    public static void main(String[] args) {
        abrirArquivo();
    }

    //    O método a baixo é um exemplo!
    public static String abrirArquivo() {
        try {
            System.out.println("Exibindo um arquivo");
            System.out.println("Escrevendo no arquivo");
            System.out.println("executando a leitura do arquivo");
            return "Valor";
        } catch (Exception e) {
            System.out.println("dentro do catch");
            e.printStackTrace();
        } finally {
            System.out.println("fechar o arquivo");
        }
        return null;
    }
}
