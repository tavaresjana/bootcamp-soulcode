import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = leitura.nextInt();

        String retorno = (idade >= 18) ? "você é maior de idade" : "você é menor de idade";
        System.out.println(retorno);

        if(idade>=18){
            System.out.println("você é maior de idade");
        } else {
            System.out.println("você é menor de idade");
        }

    }
}
