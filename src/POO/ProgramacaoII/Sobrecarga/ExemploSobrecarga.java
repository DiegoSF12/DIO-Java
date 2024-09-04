package POO.ProgramacaoII.Sobrecarga;

public class ExemploSobrecarga {
    //CRIAMOS AQUI A VARIÁVEL MAIOR QUE SERÁ USADA NA VERIFICAÇÃO
    // DO MAIOR NÚMERO DIGITADO
    double maior;

    //METODO DE VERIFICA O MAIOR ENTRE DOIS NÚMEROS DIGITADOS
    public double calcularNumeroMaior(double n1, double n2) {
        if (n1 == n2) {
            maior = 0;
        }
        else if (n1 > n2) {
            maior = n1;
        }
        else {
            maior = n2;
        }
        return maior;
    }
    //MET0DO QUE VERIFICA O MAIOR NUMERO ENTRE TRÊS NÚMEROS DIGITADOS
    public double calcularNumeroMaior(double n1, double n2, double n3){
        if((n2 > n2) && (n1 > n3)){
            maior = n1;
        }
        else if ((n2 > n1) && (n2 > n3)){
            maior = n2;
        }
        else if((n3 > n1) && (n3 > n2)){
            maior = n3;
        }
        else {
            maior = 0;
        }
        return maior;
    }

}
