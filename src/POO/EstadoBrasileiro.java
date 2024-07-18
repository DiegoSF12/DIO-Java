package POO;

public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo"),
    RIO_JANEIRO("RJ","Rio de Janeiro"),
    PIAUI("PI", "Piauí"),
    MARANHAO("MA", "MARANHÃO");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public String getSigla(){
        return this.sigla;
    }
    public String getNomeMaisculo(){
        return this.nome.toUpperCase();
    }

}
