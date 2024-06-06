package estruturas.condicionais;

public class Conta {
    public static void main(String[] args){
        double saldo = 15;
        double valorSolicitado = 17.50;
        
        if(saldo >= valorSolicitado){
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }
        else{
            System.out.println("Valor em conta insuficiente");
        }
    }
}