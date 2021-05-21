public class Arrays2 {
    public static void main(String[] args) {
        //byte,short,int,long, float, double=0
        //char *\u0000* * *
        //boolean = false
        //references = null
        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "João";
        nomes[2] = "Jhonny";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
