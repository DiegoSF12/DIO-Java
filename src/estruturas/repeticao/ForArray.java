package estruturas.repeticao;
import java.util.Scanner;

public class ForArray {
    public static void main(String[] args){
        String nome[] = new String[5];
        Scanner x = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("REGISTRO DE ALUNOS");
        for(int i = 0; i < nome.length; i++){
            System.out.printf("Digite o %dº nome: ", i+1);
            nome[i] = x.nextLine();
        }
        for(int i = 0; i < nome.length; i++){
            System.out.printf("Nome: %s\n", nome[i]);
        }
        //FORMA DE USAR O FOR / EACH, USADO EM CASOS ONDE SE EXISTA UM ARRAY DENTRO DO FOR
        for(String alunos:nome){
            System.out.println(alunos);
        }
    }
}
