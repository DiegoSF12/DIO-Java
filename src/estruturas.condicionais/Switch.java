package estruturas.condicionais;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        int opt;
        Scanner x = new Scanner(System.in);

        System.out.println("Calendario");
        System.out.println("Qual o dia desejado?");
        opt = x.nextInt();

        switch (opt){
            case 1:
                System.out.printf("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia invalido");
        }
    }
}
