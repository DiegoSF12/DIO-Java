package POO.ProgramacaoII.ArraysCollections.Arrays;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Exemplo02 {

    public static void main(String[] args){
        //CRIA UM ARRAY DE 6 ELEMENTOS
        int [] array = {10,15,25,3,8,7};
        int total = 0;
        String saida = "Indice\tValor\n";

        //ADICIONA O VALOR DE CADA ELEMENTO DO ARRAY NA VAR SAIDA
        for(int i = 0; i < array.length; i++){
            total += array[i];
            saida += i + "\t" + array[i] + "\n";
        }
        saida += "\n\nA soma dos elementos do array é  "+ total;
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        JOptionPane.showMessageDialog(null,saidaArea,"Criando um array de Inteiros",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}
