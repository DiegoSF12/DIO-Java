
public class IfElse {
    public static void main(String[] args){
        double saldo = 20;
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
