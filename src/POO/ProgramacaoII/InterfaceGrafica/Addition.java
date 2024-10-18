package POO.ProgramacaoII.InterfaceGrafica;

import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args){
        String firstNumber = JOptionPane.showInputDialog("Enter First Number");
        String secondNumber = JOptionPane.showInputDialog("Enter Second Number");

        //CONVERSÃO DE TIPOS (CASTING)
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int add = number1 + number2;

        JOptionPane.showMessageDialog(null,"The sum is "+add,"Sum of two Integers",JOptionPane.PLAIN_MESSAGE);
    }
}
