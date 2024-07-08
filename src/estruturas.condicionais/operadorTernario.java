package estruturas.condicionais;

import java.util.Scanner;

public class operadorTernario {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int nota;
        String resultado;

        System.out.println("Digite o valor da sua nota");
        nota = x.nextInt();
        //NESTE EXEMPLO USAMOS O OPERADOR TERNARIO AO INVES DO IF ELSE
        resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        //AINDA USANDO O OPERADOR TERNARIO PORÉM COM MAIS CONDIÇÕES, DA MESMA FOMRA COMO É USADO O IF E ELSE.
        resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
