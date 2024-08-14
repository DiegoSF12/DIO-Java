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

    public void imprime(){
        System.out.println(getNome());
        if(time != null) {
            System.out.println(time.getTime());
        }
    }

    public void setTime(Time time) {
    }
}
