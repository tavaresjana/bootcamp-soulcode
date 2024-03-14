import java.util.Random;
import java.util.Scanner;

public class GameRandom {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Random random = new Random();

        int palpite = 0, numerodasorte = random.nextInt(10) + 1;

        System.out.println("Você deve acertar o número que o robô está pensando... ");

        int contador = 0;
        int chances = 5;

        String retorno = (numerodasorte > palpite) ? "Tente um número maior" : "Tente um número menor";

        while (palpite != numerodasorte && contador < 5) {
            System.out.println("Vamos ver se você acerta? Digite um número.");
            palpite = leitura.nextInt();

            if (palpite == numerodasorte) {
                System.out.println("Parabénssssss você acertou!");
            } else {
                chances = chances - 1;
                if (chances == 0) {
                    System.out.println("Game over!");
                } else {
                    System.out.println("Tente novamente. Você ainda tem " + chances + " chances.\n" + retorno);
                }
                contador++;
            }
        }


    }
}