public class HelloWorld {
    public static void main(String[] args){
        String nome, sobrenome, nomeCompleto;
        nome = "Diego ";
        sobrenome = "Souza";
        nomeCompleto = NomeTodo(nome, sobrenome);
        System.out.printf("Hello World, %s", nomeCompleto);

    }
    public static String NomeTodo(String nome, String sobrenome){
        return nome.concat(sobrenome);
    }
}
