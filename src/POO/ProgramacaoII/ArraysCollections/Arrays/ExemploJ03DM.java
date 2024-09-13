package POO.ProgramacaoII.ArraysCollections.Arrays;

import javax.swing.*;
import java.awt.*;

public class ExemploJ03DM extends JFrame {
    JTextArea saidaArea;

    public ExemploJ03DM() {
        //CONFIGURA O TÍTULO DA JANELA
        super("Exibição de Arrays");

        //CRIA A AREA DE TEXTO E AJUSTA SUA FONTE
        saidaArea = new JTextArea();
        saidaArea.setFont(new Font("Monospaced",Font.PLAIN,14));//FONTE MAIS LEGIVEL
        saidaArea.setMargin(new Insets(10,10,10,10));
        saidaArea.setEditable(false);//DESATIVA A EDIÇÃO NA CAIXA DE TEXTO

        //ADICIONA O JTEXTAREA EM UM JSCROLLPANE PARA PERMITIR A ROLAGEM
        JScrollPane scrollPane = new JScrollPane(saidaArea);

        //DEFINE O LAYOUT DA JANELA
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);

        //ADICIONA PS ARRAYS DE EXEMPLO
        int[][] array01 = {{1,2,3},{4,5,6}};
        int[][] array02 = {{7,8,9},{10,11,12}};

        saidaArea.setText("Os valores do array01 são: \n");
        buildSaida(array01);

        saidaArea.append("Os valores do array02 são: \n");
        buildSaida(array02);

        //CONFIGURA A JANELA
        setSize(400,300);//AJUSTA O TAMANHO DA JANELA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//FECHA A APLICAÇÃO AO CLICAR NO BOTÃO DE FECHAR
        setVisible(true);//TORNA A JANELA VISÍVEL
    }
    public void buildSaida(int[][] array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                saidaArea.append("\t"+array[i][j]+"");
            }
            saidaArea.append("\n");
        }
        saidaArea.append("\n");
    }
    public static void main(String[] args){
        new ExemploJ03DM();
    }
}
