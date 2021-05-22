package br.com.maratonajava.introducao.arrays;

public class Arrays5 {
    public static void main(String[] args) {
        int[][] dias = {{1,2},{3,4,5},{6,7,8,9,10}};
       // dias[0] = new int[]{1,2,3};
       // dias[1] = new int[]{4,5,6};
      //  dias[2] = new int[]{7,8,9};
        for (int[] arr : dias){
            for (int num : arr){
                System.out.println(num);
            }
        }
    }

}
