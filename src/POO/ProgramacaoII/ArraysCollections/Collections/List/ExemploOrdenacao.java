package POO.ProgramacaoII.ArraysCollections.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ExemploOrdenacao {
    public static void main(String[] args){
        List <String> listaNomes = new ArrayList<String>();
        listaNomes.add("Maria");
        listaNomes.add("João");
        listaNomes.add("José");
        listaNomes.add("Adriano");
        listaNomes.add("Willian");
        listaNomes.add("Patrícia");

        String saida = "";
        saida += "Lista Desordenada: "+listaNomes;

        Collections.sort(listaNomes);

        saida += "\nLista Ordenada: "+listaNomes;

        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);

        JOptionPane.showMessageDialog(null, saidaArea,"Trabalhando com ArrayList",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);



    }
}
