package Testes;

import java.util.Locale;
import java.util.Scanner;

public class IOtest {
    public static void main(String[] args){
        String nome;
        Scanner x = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Seja bem vindo, qual o seu nome;");
        nome = x.nextLine();
        System.out.printf("Muito prazer, %s \n", nome);
    }
}
