package POO.ProgramacaoII.Abstract;

import java.sql.SQLOutput;

public class Cd extends Dvd{

    @Override
    public void cadastrar(){
        setCodigo(1);
        setTitulo("The Best of Joy Division");
        setSituacaoItem("L");
        System.out.printf("CD Cadastrado\n-Codigo = %d\n-Titulo = %s\n-Situação = %s\n",getCodigo(), getTitulo(), getSituacaoItem());
        System.out.println("CD Cadastrado usando o metodo herdado da classe abstrata ItemAbstrato");
    }

    @Override
    public void imprimir(){
        System.out.println("Impressão da lista de CDs");
        System.out.println("Metodo herdado da classe Dvds");
    }

    public void vender(){
        System.out.println("CD Vendido utilizando um metodo concreto da classe Cd");
    }

    public static Cd getInstance(){
        return new Cd();
    }
}
