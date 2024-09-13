package Testes;

public class teste {
    public static void main(String[] args) {
       int [] numeros = new int[]{1,5,6,8,7};
        System.out.println(arrayTam(numeros));
    }
    public static int arrayTam(int [] array){
        return array.length;
    }
}
