package Atividades;

import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario func01 = new Funcionario("Diego", 20);
        Scanner scanner = new Scanner(System.in);

        func01.setSalario(scanner);
        System.out.printf("A media salarial é: %.2f",func01.mediaSalario());
    }
}
