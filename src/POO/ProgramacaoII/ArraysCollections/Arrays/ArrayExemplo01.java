package POO.ProgramacaoII.ArraysCollections.Arrays;

import java.util.Scanner;

public class ArrayExemplo01 {
    public static void main(String[] args){

        //FORMA SIMPLES E MAIS VERBOSA DE SE DECLARAR E INSTANCIAR E INICIALIZAR UM ARRAY
        Carro [] carros = new Carro[4];

        carros[0] = new Carro();
        carros[1] = new Carro();
        carros[2] = new Carro();
        carros[3] = new Carro();

        //OUTRA FORMA, UM POUCO MAIS SIMPLES E OBJETIVA DE SE FAZER
        long x = 2;
        long [] id = {1,x,3};

        //FORMA DE SE REALIZAR A CRIAÇÃO DE OBJETOS NO MOMENTO DA DECLARAÇÃO FAZENDO COM QUE A INSTANCIA OCORRA NO MESMO MOMENTO
        //ARRAY DE OBJETOS
        Carro fiat = new Carro();
        Carro [] carros02 = {fiat, new Carro("Audi"), new Carro("Chevrolet"),new Carro("Ford")};

        //FIZ DE UMA FORMA COM QUE O PROPRIO USUÁRIO ISERISSE AS INFORMAÇÕES A SEREM GUARDADAS NO ARRAY
        //UM POUCO MAIS COMPLEXO PORÉM MAIS LEGIVEL
        Carro [] carros03 = new Carro[4];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < carros03.length; i++){
            System.out.printf("Digite o nome do %dº carro: ", i+1);
            String nomeCarro = scan.nextLine();
            carros03[i] = new Carro(nomeCarro);
        }
        scan.close();
        Carro.imprimir(carros03);//METODO QUE VEM DA CLASSE CARRO




    }
}
