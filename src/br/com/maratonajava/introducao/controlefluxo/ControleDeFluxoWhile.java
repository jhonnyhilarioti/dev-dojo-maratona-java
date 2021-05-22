package br.com.maratonajava.introducao.controlefluxo;

public class ControleDeFluxoWhile {
    public static void main(String[] args) {
        int contador = 0;
        while(contador < 10){
            System.out.println(contador);
            contador ++;
        }
        contador = 0;
        do{
            System.out.println("Dentro do do while" + contador++);
        }while(contador < 10);

        for (int i = 0; i < 10 ; i++) {
        //para i, começando de 0 e incrementando de 1 em 1
            System.out.println("O valor de i é "+i);
            if (i == 5){
                break;
            }
        }

    }
}
