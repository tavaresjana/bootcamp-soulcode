package aula1403;

import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int[] numeros = new int[4];

        numeros[1] = 10;
        numeros[3] = 8;
        numeros[0] = 9;
        numeros[2] = 4;


        System.out.println("Valor na posição 1: "+numeros[1]);
        for(int i = 0;  i < numeros.length; i++){
            System.out.println("Posição: "+i+ ". Número: "+ numeros[i]);
        }

        String[] nomes = new String[3];

        nomes[0] = "Jana";
        nomes[1] = "Lari";
        nomes[2] = "Dory";

        for(int i = 0;  i < nomes.length; i++){
            System.out.println("Nome: "+ nomes[i] + ", Idade: "+numeros[i]);
        }
    }
}
