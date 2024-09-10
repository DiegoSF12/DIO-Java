package POO.ProgramacaoII.TryCatch;

import POO.ProgramacaoII.TryCatch.TryCatch;

import static POO.ProgramacaoII.TryCatch.TryCatch.processa;

public class TrataExcecoes {
    public static void main(String[] args){
        try{
            float total = processa();
            System.out.printf("O total do processamento é: %2f", total);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
