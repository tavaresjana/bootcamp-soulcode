package aula1903;

public class Metodos {

    public static void mensagemInicial(){
        System.out.println("Bem vindo ao sistema");
    }

    public static void mensagemUsuario(String nome){
        System.out.println("Bem vindo "+nome);
    }

    public static int somar(int numero1, int numero2){
        return numero1 + numero2;
    }


    public static void main(String[] args) {
        mensagemInicial();
        mensagemUsuario("Janaina");
        System.out.println(somar(10,15));
    }
}
