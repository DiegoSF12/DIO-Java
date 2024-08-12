package POO.associacao;

public class Jogador {
    private String nome;
    private Time time;
    public Jogador(String nome){
        this.nome = nome;
    }

    private String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTime(Time time){
        this.time = time;
    }

    public Time getTime(){
        return time;
    }

    public void imprime(){
        System.out.println(getNome());
        System.out.println(getTime());
    }
}
