package POO.ProgramacaoII.Abstract;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        int opcao;
        Dvd dvd;
        Cd cd;
        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("Digite 0 para Sair ou a opção abaixo:");
            System.out.println("1 - Cadastrar DVD\n2 - Emprestar DVD\n3 - Devolver DVD");
            System.out.println("4 - Cadastrar CDs\n5 - Vender CDs\n6 - Imprimir CDs");
            System.out.println("Opção: ");

            Scanner scan = new Scanner(System.in);
            opcao = scan.nextInt();

            System.out.println("-----------------------------------------");
            if (opcao == 0) {
                System.exit(0);
            }
            switch (opcao) {
                case 1:
                    dvd = Dvd.getInstance();
                    dvd.cadastrar();
                    break;
                case 2:
                    dvd = Dvd.getInstance();
                    dvd.emprestar();
                    break;
                case 3:
                    dvd = Dvd.getInstance();
                    dvd.devolver();
                    break;
                case 4:
                    cd = Cd.getInstance();
                    cd.cadastrar();
                    break;
                case 5:
                    cd = Cd.getInstance();
                    cd.vender();
                    break;
                case 6:
                    cd = Cd.getInstance();
                    cd.imprimir();
                    break;
            }
        }
    }
}
