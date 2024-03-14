import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numero;
        numero = 15;

        int[] numeros = new int[3];

        numeros[0] = 9;
        numeros[1] = 10;
        numeros[2] = 5;

        String[] nomes = new String[3];

        nomes[0] = "Jana";
        nomes[1] = "Lari";
        nomes[2] = "Dory";

        for(int i = 0;  i < nomes.length; i++){
            System.out.println("Nome: "+ nomes[i] + ", Idade: "+numeros[i]);
        }

    }
}
