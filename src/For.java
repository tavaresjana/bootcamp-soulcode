import java.util.Random;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor informe um número inteiro positivo: ");
        int num = scanner.nextInt();

        if (num >= 1) {
            for (int k = num; k >= 0; k--) {
                System.out.println(k);
            }
        } else {
            System.out.println("Número inválido.");
        }

        System.out.println("__________________________________");

        int idade, cont = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("digite sua idade: ");
            idade = scanner.nextInt();

            if(idade >= 18){
                cont++;
                System.out.println("usuario maior de idade");
            } else {
                System.out.println("usuario menor de idade");
            }
        }
        System.out.println("a quantidade de pessoas maiores de idade é "+ cont);

        System.out.println("__________________________________");
        int i = 0;

        while (i<10){
            System.out.println("Executando while "+i);
        }




    }
}
