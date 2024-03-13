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
    }
}
