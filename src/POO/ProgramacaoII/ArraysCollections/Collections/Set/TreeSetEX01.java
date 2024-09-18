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
        new TreeSetEX01();
    }
    public TreeSetEX01(){
        TreeSet tree = new TreeSet(Arrays.asList(cores));

        saida += "\nSet de elementos não duplicados e ordenados: ";
        this.mostrarSet(tree);

        saida += "\nSubconjunto de TreeSet menor que 'laranja': \n";
        this.mostrarSet(tree.headSet("laranja"));

        saida += "\nSubconjunto de TreeSet maior ou igual a 'laranja':\n";
        this.mostrarSet(tree.tailSet("laranja"));

        saida += "\nPrimeiro elemento de set: "+tree.first();

        saida += "\nUltimo elemento do Set: "+tree.last();

        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);

        JOptionPane.showMessageDialog(null,saidaArea,"Trabalhando com Sets",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    private void mostrarSet(SortedSet ss){
        Iterator iterator = ss.iterator();

        while(iterator.hasNext()){
            saida += iterator.next() +" ";
        }
    }
}