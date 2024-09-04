package POO.associacao;

import POO.associacao.TimeX;

public class JogadorX {
    private String nome;
    private Time time;
    public JogadorX(String nome){
        this.nome = nome;
    }
    private void setNome(String nome){
        this.nome = nome;
    }
    private String getNome(){
        return this.nome;
    }
    public void imprime(){
        System.out.println(getNome());
        if(time != null){
            //System.out.println(time.imprimeTime);
        }
    }


}
