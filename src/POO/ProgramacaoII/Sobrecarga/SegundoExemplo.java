package POO.ProgramacaoII.Sobrecarga;

public class SegundoExemplo {
    //CRIAMOS AQUI UMA STRING QUE SERÁ O DDD FORMATADO
    String dddComMascara;
    //CRIAMOS AQUI UM METODO QUE RETORNA O DDD FORMATADO RECEBENDO UM DDD DO TIPO INT
    String retornaDddMascara (int ddd){
        dddComMascara = "(" +ddd+ ")";
        return dddComMascara;
    }

    //CRIAMOS AQUI UM METODO QUE RETORNA O DDD FORTATADO RECEBENDO UMA STRING
    String retornaDddMascara(String ddd){
        dddComMascara = "(" +ddd+ ")";
        return dddComMascara;
    }

}


