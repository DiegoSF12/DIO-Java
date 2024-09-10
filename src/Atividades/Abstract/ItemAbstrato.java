package Atividades.Abstract;

public abstract class ItemAbstrato {

    private int codigo;
    private String titulo;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String situacaoItem; //L = LIVRE E = EMPRESTADO

    public abstract void cadastrar();
    public abstract void emprestar();
    public abstract void devolver();

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setDataEmprestimo(String dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }
    public String getDataEmprestimo(){
        return this.dataEmprestimo;
    }

    public void setDataDevolucao(String dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
    public String getDataDevolucao(){
        return this.dataDevolucao;
    }

    public void setSituacaoItem(String situacaoItem){
        this.situacaoItem = situacaoItem;
    }
    public String getSituacaoItem(){
        return this.situacaoItem;
    }
}
