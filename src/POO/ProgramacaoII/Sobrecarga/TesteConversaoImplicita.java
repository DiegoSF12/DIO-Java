package POO.ProgramacaoII.Sobrecarga;

import javax.swing.*;

public class TesteConversaoImplicita {
    public static void main(String[] args){
        ConversaoImplicita c1 = new ConversaoImplicita();
        JOptionPane.showMessageDialog(null,"Quadrado de 3 = "+ c1.retornaQuadradoDoNumero(3));
        JOptionPane.showMessageDialog(null,"O quadrado de '3' = "+ c1.retornaQuadradoDoNumero('3'));

    }
}
