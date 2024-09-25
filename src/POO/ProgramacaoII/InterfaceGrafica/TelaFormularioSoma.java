/*package POO.ProgramacaoII.InterfaceGrafica;

import javax.swing.*;
import javax.swing.text.FlowView;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaFormularioSoma extends JFrame{
    
    private JLabel rotulovalor1;
    private JLabel rotulovalor2;
    private JTextField campoValor1;
    private JTextField campoValor2;
    private JTextField campoResultado;
    private JLabel rotuloResultado;
    private JButton botaoSoma;
    private JButton botaoLimpar;

    public TelaFormularioSoma(){
        super("Exemplo JTextField");

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(275,180);
        //CHAMAR METODO
    }

    //INNER CLASS (QUANDO SE CRIA E CHAMA UMA CLASSE DENTRO DE OUTRA)
    private class TrataEventoBotao implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            campoResultado.setEditable(true);

            if(campoValor1.getText() != null && campoValor2.getText() != null
            && !campoValor1.getText().isEmpty() && !campoValor2.getText().isEmpty()){
                int valor1 = Integer.parseInt(campoValor1.getText());
                int valor2 = Integer.parseInt(campoValor2.getText());

                campoResultado.setText(String.valueOf(valor1 + valor2));
            }else {
                JOptionPane.showMessageDialog(null,"Não são permitidos valores nulos");
            }
        }

        private void configuraTela(){
            rotulovalor1 = new JLabel("Primeio Numero");
            rotulovalor1.setToolTipText("Digite o primeiro número");
            this.add(rotulovalor1);

            campoValor1 = new JTextField(10);
            this.add(campoValor1);

            rotulovalor2 = new JLabel("Segundo Numero");
            rotulovalor2.setToolTipText("Digite o segundo número");
            this.add(rotulovalor2);

            campoValor2 = new JTextField(10);
            this.add(campoValor2);

            botaoSoma = new JButton("Soma");

            TrataEventoBotao trataEvento = new TrataEventoBotao();
            botaoSoma.addActionListener(trataEvento);
            rotuloResultado = new JLabel("Resultado");
            rotuloResultado.setToolTipText("Resultado da Soma");
            this.add(rotuloResultado);

            campoResultado = new JTextField(10);
            campoResultado.setEditable(false);
            this.add(campoResultado);

            this.add(botaoSoma);

            botaoLimpar = new JButton("Limpar");
            botaoLimpar.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent arg0) {
                    campoValor1.setText("");
                    campoValor2.setText("");
                    campoResultado.setText("");
                }
            });
            this.add(botaoLimpar);








        }
    }
}

 */