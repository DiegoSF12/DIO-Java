package POO.Atividades;

import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario func01 = new Funcionario("Diego", 20);
        Scanner scanner = new Scanner(System.in);

        func01.setSalario(scanner);
        func01.ficha();

    }
}
