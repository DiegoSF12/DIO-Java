package POO.ProgramacaoII.ArraysCollections;

import javax.swing.*;

public class Exemplo {
    public static void main(String[] args) {
        int [] array; //DECLARA A REFERÊNCIA PARA UM ARRAY
        array = new int[10]; //CRIA UM ARRAY COM 10 ELEMENTOS
        String saida = "Indice \tValor\n";

        //ADICIONANDO O VALOR DE CADA ELEMENTO DO ARRAY
        for(int i = 0; i < array.length; i++){
            saida += i + "\t" + array[i] + "\n";
        }
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);

        JOptionPane.showMessageDialog(null,saidaArea,"Criando um array de inteiros",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
