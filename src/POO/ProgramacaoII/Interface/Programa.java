package POO.ProgramacaoII.Interface;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        BluRay objBluRay = new BluRay();
        ItemBluRay objItem;
        int op;
        while (true) {
            objItem = new ItemBluRay();
            System.out.println("1 - Cadastrar Blu-Ray");
            System.out.println("2 - Imprimir a lista de Blu-Rays");
            System.out.println("3 - Cadastrar Blu-Ray com desconto");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma das opções");
            Scanner scan = new Scanner(System.in);
            op = scan.nextInt();
            if (op == 0) {
                System.exit(0);
            }
            switch (op){
                case 1:
                    objBluRay.cadastrarBluRay(objItem);
                    objBluRay.adicionarLista(objItem);
                    break;
                case 2:
                    objBluRay.imprimirLista();
                    break;
                case 3:
                    objBluRay.cadastrarBluRay(objItem);
                    System.out.printf("Valor do Blu-Ray com promoção de: %.2f\n",InterfaceBluRay.PRMOCAO);
                    double valorDesconto = objItem.getPreco() - (objItem.getPreco() * InterfaceBluRay.PRMOCAO / 100);
                    objItem.setPreco(valorDesconto);
                    objBluRay.adicionarLista(objItem);
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção Inválida");

            }

        }
    }
}
