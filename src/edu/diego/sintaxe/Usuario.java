package edu.diego.sintaxe;

public class Usuario {
    public static void main(String[] args){
        SmartTV novaTV = new SmartTV();

        System.out.printf("A TV esta ligada? %b\n",novaTV.estado);
        novaTV.onOff();
        System.out.printf("A TV esta ligada? %b",novaTV.estado);
        novaTV.diminuirVolume();
        novaTV.mudarCanal(50);
        novaTV.aumentarVolume();
        System.out.printf("A TV esta ligada? %b\nO Volume dela é: %d\nE esta no canal: %d",novaTV.estado,novaTV.volume,novaTV.canais);
    }

}

