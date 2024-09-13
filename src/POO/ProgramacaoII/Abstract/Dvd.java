package POO.ProgramacaoII.Abstract;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dvd extends ItemAbstrato{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Dvd(){

    }

    @Override
    public void cadastrar() {
        setCodigo(1);
        setTitulo("Shrek");
        setSituacaoItem("L");
        System.out.printf("DVD Cadastrado: \n-Cod = %d\n-Titulo = %s\n-Situação = %s\n", getCodigo(),getTitulo(),getSituacaoItem());
        System.out.println("DVD Cadastrado utilizando o metodo abstrato \nherdado da classe anbstrata ItemAbstrato");
    }

    @Override
    public void emprestar() {
        setSituacaoItem("E");
        setDataEmprestimo(sdf.format(new Date()));
        System.out.printf("DVD Emprestado:\n-Situação = %s\n-Data Emprestimo = %s", getSituacaoItem(), this.getDataEmprestimo());
        System.out.println("DVD Emprestado utilizando metodo abstrato herdado da classe abstrata ItemAbstrato");

    }

    @Override
    public void devolver() {
        setSituacaoItem("L");
        setDataDevolucao(sdf.format(new Date()));
        System.out.printf("DVD Devolvido\n-Situação = %s\n-Data Devolucao = %s",getSituacaoItem(), this.getDataDevolucao());
<<<<<<< HEAD:src/Atividades/Abstract/Dvd.java

=======
>>>>>>> 3279f6f79e19998edaf83ff2882c3f28b15cb3dc:src/POO/ProgramacaoII/Abstract/Dvd.java

    }

    public void imprimir(){
        System.out.printf("Imprimir lista de DVDs usando metodo concreto: %s\n", getTitulo());

    }
    public static Dvd getInstance(){
        return new Dvd();
    }

}
