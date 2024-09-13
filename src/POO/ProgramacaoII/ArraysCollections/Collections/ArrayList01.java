package POO.ProgramacaoII.ArraysCollections.Collections;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ArrayList01 {
    public static void main(String[] args){
        List <String> listaFrutas = new ArrayList<String>();
        String s = "uva";
        listaFrutas.add("melancia");
        listaFrutas.add(s);
        listaFrutas.add("caju");

        String saida = "";
        saida += "Frutas da lista: "+listaFrutas.toString();
        saida += "\nTotal de frutas na lista: "+listaFrutas.size();
        saida += "\nA lista possui pera? "+listaFrutas.contains("pera");
        saida += "\n A lista possui caju? "+listaFrutas.contains("caju");
        listaFrutas.remove("uva");

        saida += "\n Total de frutas da lista apoós remover uva: "+listaFrutas.size();
        saida += "\n Frutas da lista após remover uva da lista: "+listaFrutas.toString();
        saida += "\nIndice da fruta caju na lista: "+listaFrutas.indexOf("caju");

        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);

        JOptionPane.showMessageDialog(null,saidaArea,"Trabalhando com ArrayList",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}
