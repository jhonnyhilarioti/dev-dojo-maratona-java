public class ControleFluxoIfElse {
    public static void main(String[] args) {
        int idade = 15;
        String categoria;
        if(idade < 15){
           categoria = "Infantil;";
        }else if(idade >= 15 && idade < 18){
            categoria = "Juvenil";
        }else{
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}
