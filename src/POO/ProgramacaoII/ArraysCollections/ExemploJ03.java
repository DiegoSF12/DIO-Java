package POO.ProgramacaoII.ArraysCollections;

import javax.swing.*;
import java.awt.*;

public class ExemploJ03 extends JFrame {
    JTextArea saidaArea;

    public ExemploJ03(){
        saidaArea = new JTextArea();
        Container container = getContentPane();
        container.add(saidaArea);

        int[][] array1 = {{1,2,3}, {4,5,6}};
        int[][] array2 = {{1,2,3}, {4,5,6}};

        saidaArea.setText("Os valores do array1 são: \n");
        buildSaida(array1);

        saidaArea.append("Os valores do array2 são: \n");
        buildSaida(array2);

        saidaArea.append("\tQue negocio feio kkkk");

        setSize(350,350);//CONFIGURANDO O TAMANHO DA JANELA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//FECHA A APLICAÇÃO AO CLICAR NO BOTÃO FECHAR
        setVisible(true);//TORNA A JANELA VISIVEL
    }
    public void buildSaida(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++ ){
                saidaArea.append(array[i][j] + "");
            }
            saidaArea.append("\n");
        }
        saidaArea.append("\n");
    }
    public static void main(String[] args){
        new ExemploJ03();
        System.out.println("Que trem fei");
    }
}
