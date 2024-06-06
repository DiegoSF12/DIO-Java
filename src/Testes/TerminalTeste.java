package Testes;

public class TerminalTeste {
    public static void main(String[] args){
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.printf("Olá, me chamo %s %s, tenho %d anos e %.2f de altura",nome, sobrenome, idade, altura);

    }
}
