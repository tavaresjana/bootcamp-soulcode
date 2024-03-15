import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 1;
        numeros[2] = 12;
        numeros[3] = 5;
        numeros[4] = 4;

        int aux = 0;
        int i = 0;

        System.out.println("Vetor desorganizado:");
        for (i = 0; i < 5; i++) {
            System.out.println(" " + numeros[i]);
        }
        System.out.println(" ");

        for (i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        for (i = 0; i < numeros.length; i++) {
            System.out.println(" " + numeros[i]);
        }

        for(i=0; i<4; i++){
            System.out.println("Primeiro For - fora");
            for (int j=0; j<4; j++){
                System.out.println("Segundo for - dentro");
            }
        }

    }
}
