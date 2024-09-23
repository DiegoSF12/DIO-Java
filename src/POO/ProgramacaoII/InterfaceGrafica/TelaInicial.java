package POO.ProgramacaoII.InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;

public class TelaInicial extends JFrame{
    private JLabel label1;

    public TelaInicial(){
        super("Tela Inicial");
        this.configuroTela();
    }

    private void configuroTela(){
        this.setLayout(new FlowLayout());//SETO O GERENCIADOR DE LAYOUT DOS COMPONENTES
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,250);

        label1 = new JLabel("Seja bem vindo");
        label1.setToolTipText("Este é o rotulo 1");
        add(label1);
    }

    public static void main(String[] args){
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
    }
}

