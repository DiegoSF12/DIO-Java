//APENAS UM ALGORITMO DE TESTES PARA SE USAR O CONTINUE PARA IMPRIMIR SOMENTE NUMEROS PARES OU IMPARES NA TELA

package estruturas.repeticao;

public class Teste {
    public static void main(String[] args){
        int numero = 0;

        for(int i = 0;i <= 100; i++){
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
