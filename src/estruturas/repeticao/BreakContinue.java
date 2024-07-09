package estruturas.repeticao;

public class BreakContinue {
    public static void main(String[] args){
        //NESTE EXEMPLO USAMOS O CONTINUE, QUE TEM A FUNÇÃO DE PULAR UM DETERMINADO LAÇO DA REPETIÇÃO
        //COMO NESSE CASO, ELE VAI DE 1 A 5 MAS PULA O NUMERO 3
        System.out.println("Dentro do continue");
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
        //NESTE EXEMPLO USAMOS O BREAK, QUE TEM A FUNÇÃO DE INTERROMPER O LAÇO QUANDO ECONTRAR AQUELA SITUAÇÃO
        //NESSE CASO TEMOS O LAÇO QUE VAI SE 1 A 5 PORÉM É INTERROMPIDO QUANDO SE ECONTRA O NUMERO 3
        System.out.println("\nDentro do break");
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
    }
}
