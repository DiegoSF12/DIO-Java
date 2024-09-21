package POO.ProgramacaoII.ArraysCollections.Collections.Set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TreeSetEX01 {

    String saida = "";
    private String[] cores = {"vermelho","branco","azul","verde","cinza",
            "laranja","\n","bronzeado","branco","ciano","pêssego","cinza","laranja"};

    public static void main(String[] args){

    }
    public TreeSetEX01(){
        TreeSet tree = new TreeSet(Arrays.asList(cores));

        //saida += "\nSet de elementos não duplicados e ordenados: "+this.mostrarSet(tree);

        saida += "";
    }
}
