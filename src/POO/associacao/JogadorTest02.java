package POO.associacao;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jog01 = new Jogador("Diego");
        Time time = new Time("Ponte preta");
        jog01.setTime(time);
        jog01.imprime();

    }
}
