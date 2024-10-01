package POO.ProgramacaoII.InterfaceGrafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class TelaVerImagem extends JFrame {

    public TelaVerImagem(){
        super("Tela para visualização de imagens");

        this.configuraTelaInicial();
        this.prepararMenu();
    }

    private void configuraTelaInicial(){
        this.setSize(400,350);

        //FINALIZA A APLICAÇÃO CASO ESSA JANELA SEJA FECHADA
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void prepararMenu(){
        JMenuBar barraMenu = new JMenuBar();
        this.setJMenuBar(barraMenu);

        JMenu meuArquivo = new JMenu("Arquivo");
        barraMenu.add(meuArquivo);

        JMenu tools = new JMenu("Ferramentas");
        barraMenu.add(tools);

        JMenuItem itemAbrir = new JMenuItem("Abrir");
        itemAbrir.addActionListener(new ListenerTela());
        meuArquivo.add(itemAbrir);

        JMenuItem itemSair = new JMenuItem("Sair");
        itemSair.addActionListener(new ListenerTela());
        meuArquivo.add(itemSair);

        JMenuItem redimensionar = new JMenuItem("Editar a imagem");
        tools.add(redimensionar);
    }

    private class ListenerTela implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent evento) {
            String acao = evento.getActionCommand();

            if("Abrir".equals(acao)){
                JOptionPane.showMessageDialog(null,"Abrir evento");
            }else if("Sair".equals(acao));
            fecharTela();
        }
    }

    private void fecharTela(){
        this.setVisible(false);
        System.exit(0);
    }

    public static void main(String[] args){
        TelaVerImagem tela = new TelaVerImagem();
        Scanner scan = new Scanner(System.in);

        String resposta;

        System.out.println("Deseja ver a janela?");
        resposta = scan.nextLine();
        if(resposta.equals("Sim")){
            tela.setVisible(true);
        }else {
            tela.setVisible(false);
            System.out.println("Obrigado, encerrando á aplicação");
            System.exit(0);
        }
    }
}
