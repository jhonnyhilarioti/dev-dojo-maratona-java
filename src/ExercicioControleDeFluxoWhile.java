public class ExercicioControleDeFluxoWhile {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000.000
        int valor = 1000000;
        for (int i = 0; i < valor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
