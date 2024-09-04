package POO.ProgramacaoII.Sobrecarga;

import javax.swing.JOptionPane;

public class TesteSobreCarga {
    public static void main(String[] args){
        double n1, n2, n3, maior;
        //TESTANDO O PRIMEIRO METODO
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));

        ExemploSobrecarga ex01 = new ExemploSobrecarga();
        maior = ex01.calcularNumeroMaior(n1, n2);
        JOptionPane.showMessageDialog(null, "Maior numero digitado "+ maior);

        //TESTANDO O SEGUNDO METODOO;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número"));
        ExemploSobrecarga ex02 = new ExemploSobrecarga();
        maior = ex02.calcularNumeroMaior(n1,n2,n3);
        JOptionPane.showMessageDialog(null, "O maior número entre os três é " + maior);



    }


}
