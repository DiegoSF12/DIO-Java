package POO.associacao;

public class JogadorTestX01 {
    public static void main(String[] args) {
        Jogador jog01 = new Jogador("Diego");
        Time time01 = new Time("Ponte preta");
        jog01.setTime(time01);
        jog01.imprime();

    }
}
