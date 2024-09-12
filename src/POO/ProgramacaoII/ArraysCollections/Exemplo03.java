// ESSA ERA UMA FORMA DE SE FAZER USANDO O JAPPLETS, PORÉM O JAVA DEIXOU DE OFERECER SUPORTE
//DESDE A SUA VERSÃO 9, ENTÃO ESSA CLASSE NUNCA VAI SER EXECUTADA DE FORMA NATIVA
//COMO ALTERNATIVA VÁ PARA A CLASSE EXEMPLOJ03 PARA VISUALIZAR COM O JFRAME

package POO.ProgramacaoII.ArraysCollections;

import java.awt.Container;
import javax.swing.JApplet;
import javax.swing.JTextArea;

public class Exemplo03 extends JApplet{
    JTextArea saidaArea;

    @Override
    public void init(){
        super.init();

        saidaArea = new JTextArea();
        Container container = getContentPane();
        container.add(saidaArea);

        int[][] array1 = {{1,2,3},{4,5,6}};
        int[][] array2 = {{1,2,3}, {4,5,6}};

        saidaArea.setText("Os valores do array1 são: \n");
        buildSaida(array1);

        saidaArea.append("Os valores do array2 são: \n");
        buildSaida(array2);
    }
    public void buildSaida(int[][] array){
        //PERCORRE AS LINHAS DO ARRAY COM UM FOR
        for(int i = 0; i < array.length; i++){
            //PERCORRE AS COLUNAS DA LINHA CORRENTE COM OUTRO FOR
            for(int j = 0; j < array[i].length; j++){
                saidaArea.append(array[i][j] + "");
            }
            saidaArea.append("\n");
        }
        saidaArea.append("\n");
    }
}