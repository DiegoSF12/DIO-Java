package estruturas.repeticao;

import java.util.Random;

public class DoWhile {
    public static void main(String[] args){
        System.out.println("Discando...");
        do{
            //executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
        }while(tocando());
        System.out.println("Alô!!!");
    }

    public static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.printf("Atendeu? %b\n",atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }

}
