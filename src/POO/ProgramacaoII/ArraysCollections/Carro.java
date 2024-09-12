package POO.ProgramacaoII.ArraysCollections;

public class Carro {
    private String modelo;
    private int anoFab;
    private String marca;

    public Carro(String modelo){
        this.modelo = modelo;
    }
    public Carro(){

    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public static void imprimir(Carro [] carros){
        for(Carro i : carros){
            System.out.println(i.modelo);
        }
    }
}
