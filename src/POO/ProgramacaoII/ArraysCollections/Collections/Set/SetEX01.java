package POO.ProgramacaoII.ArraysCollections.Collections.Set;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SetEX01 {

    String saida = "";
    private String[] cores = {"vermelho","branco","azul","verde","cinza",
            "laranja","\n","bronzeado","branco","ciano","pêssego","cinza","laranja"};

    public static void main(String[] args){
        new SetEX01();
    }

    public SetEX01(){
        List lista;

        lista = new ArrayList(Arrays.asList(cores));
        saida += "Lista com elementos duplicados";
        saida += "\n"+lista;

        this.gerarListaNaoDuplicada(lista);

        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);

        JOptionPane.showMessageDialog(null,saidaArea,"Trabalhando com Sets", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
    public void gerarListaNaoDuplicada(Collection collections){

        Set set = new HashSet(collections);
        Iterator iterator = set.iterator();

        saida += "\n\nLista com elementos não duplicados\n";

        while(iterator.hasNext()){
            saida += iterator.next() + " ";
        }
    }
}
