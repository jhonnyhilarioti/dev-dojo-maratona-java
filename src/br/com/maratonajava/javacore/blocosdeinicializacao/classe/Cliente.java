package br.com.maratonajava.javacore.blocosdeinicializacao.classe;

public class Cliente {
    // 1 - Alocado espaco na memória para o objeto que será criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - O bloco de inicialização é executado
    // 4 -  o construtor é executado
    private int[] parcelas;

    {
        System.out.println("Dentro do bloco de inicialização!");
        parcelas = new int[100];
        for(int i=1; i<100;i++){
            parcelas[i-1] = i;
        }
    }
    public Cliente() {

    }

    public void setParcelas(int init[]) {
        this.parcelas = init;
    }

    public int[] getParcelas() {
        return this.parcelas;
    }


}
