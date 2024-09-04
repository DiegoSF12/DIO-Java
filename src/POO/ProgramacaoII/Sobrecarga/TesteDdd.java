package POO.ProgramacaoII.Sobrecarga;

import javax.swing.JOptionPane;

public class TesteDdd {
    public static void main(String[] args) {
        //CRIAMOS AQUI DUAS VARIAVEIS PARA DDD
        //UMA STRING E OUTRA INT
        int ddd;
        String strDdd;
        //VAMOS LER AQUI A VARIAVEL DDD QUE É INTEGER
        ddd = Integer.parseInt(JOptionPane.showInputDialog("Digite o DDD de sua cidade"));
        //AQUI VAMOS LER A VARIAVEL DDD QUE É UMA STRING
        strDdd = JOptionPane.showInputDialog("Digite o DDD de sua cidade");

        SegundoExemplo se01 = new SegundoExemplo();
        //VAMOS IMPRIMIR PRIMEIRO O DDD INT COM MASCARA
        JOptionPane.showMessageDialog(null, "DDD int com mascara: " + se01.retornaDddMascara(ddd));

        //VAMOS IMPRIMIR AGORA O DDD STRING COM MASCARA
        JOptionPane.showMessageDialog(null,"O DDD string com a mascara fica: " + se01.retornaDddMascara(ddd));

    }
}
