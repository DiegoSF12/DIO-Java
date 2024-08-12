package POO.Atividades;

import java.util.Scanner;

public class Funcionario {
    final int tam = 3;
    private int idade;
    private String nome;
    private double[] salario = new double[tam];

    public Funcionario(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setSalario(Scanner x) {
        for (int i = 0; i < tam; i++) {
            System.out.printf("Digite o valor do %dºsalario: ", i + 1);
            salario[i] = x.nextDouble();
        }
    }

    public void mostrarSalario() {
        for (double i : salario){
            System.out.printf("%º Salario: ",i+1);
        }
    }
    private double mediaSalario(){
        double temp = 0;
        for(int i = 0; i < tam; i++){
            temp = salario[i] + temp;
        }
        temp = temp / tam;
        return temp;
    }
    public void ficha(){
        System.out.printf("Nome: %s\nIdade: %d anos\nMedia salarial: %.2f",getNome(), getIdade(), mediaSalario());
    }
}

