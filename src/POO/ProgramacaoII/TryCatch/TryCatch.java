package POO.ProgramacaoII.TryCatch;

public class TryCatch {
    public static float processa() throws Exception {
        float valor1 = 10;
        float valor2 = 20;
        if (valor1 < 10) {
            throw new RuntimeException("Valor1 não pode ser menor que 10");
        }
        if (valor2 > 20) {
            throw new Exception("Valor2 não pode ser menor que 20");
        }
        return valor1 + valor2;
    }
}