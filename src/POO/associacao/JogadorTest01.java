package POO.associacao;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jog01 = new Jogador("Bebeto");
        Jogador jog02 = new Jogador("Romario");
        Jogador jog03 = new Jogador("Cleyton");

        Jogador[] jogadores = new Jogador[]{jog01, jog02, jog03};
        for (Jogador x : jogadores){
            x.imprime();
        }
    }
}
