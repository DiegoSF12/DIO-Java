package POO.associacao;

public class TimeX {
    private String nomeTime;

    public TimeX(String nomeTime){
        this.nomeTime = nomeTime;
    }
    public void setNomeTime(String nomeTime){
        this.nomeTime = nomeTime;
    }
    public String getNomeTime(){
        return nomeTime;
    }
    public String imprimeTime(){
        return getNomeTime();
    }
}
