package estruturas.repeticao;

public class For {
    public static void main(String[] args){
        int qtd = 0;
        for(int i = 0; i <= 10; i++){
            System.out.print(i+"\t");
            qtd++;
        }
        System.out.printf("\nQuantidade de iterações: %d", qtd);
    }
}
