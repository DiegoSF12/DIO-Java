package edu.diego.sintaxe;

public class SmartTV {
    boolean estado = false;
    int canais = 0;
    int volume = 0;

    public SmartTV(){
        this.estado = false;
        this.canais = 0;
        this.volume = 0;
    }            
    
    public void onOff (){
        if(estado == false){
            estado = true;
        } else {
            estado = false;
        }
    }
    public void mudarCanal(int numCanal){
        this.canais = numCanal;
    }
    public void aumentarVolume(){
        if(volume <= 100){
        volume = volume + 1;
        } 
        else {
            System.out.println("Volume máximo atingido");
        }
    }
    public void diminuirVolume(){
        if(volume == 0){
            System.out.println("Impossivel abaixar, volume minimo atingido");
        }
        else {
            volume = volume - 1;
        }
    }
}