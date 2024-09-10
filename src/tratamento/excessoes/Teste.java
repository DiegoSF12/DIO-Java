package tratamento.excessoes;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Teste {
    public static void main(String[] args) {
        try{
            Scanner x = new Scanner(System.in);
            int num;
            System.out.println("Digite um valor");
            num = x.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Erro no tipo de dado inserido");
        }

    }
}
