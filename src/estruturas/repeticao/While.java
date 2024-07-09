package estruturas.repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        int count = 0;
        double mesada = 50.0;
        while(mesada > 0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.printf("Doce do valor R$%.2f adicionado ao carrinho\n",valorDoce);
            mesada = mesada - valorDoce;
            count++;
        }
        System.out.printf("Mesada: %.2f\n", mesada);
        System.out.printf("Joãozinho gastou toda a sua mesada e comprou %d doces\n",count );
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}
