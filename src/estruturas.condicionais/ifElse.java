package estruturas.condicionais;
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args){
        int nota = 0;
        Scanner x = new Scanner(System.in);
        System.out.println("Digite a sua nota");
        nota = x.nextInt();

        if(nota >= 8) {
            System.out.println("Aprovado");
        }
        else if (nota >= 5 && nota < 8) {
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
