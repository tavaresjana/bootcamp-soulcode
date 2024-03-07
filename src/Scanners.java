import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("===== CADASTRO =====");

        System.out.println("Olá usuário, qual sua idade?");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("legal, e qual seu nome?");
        String palavra = scanner.nextLine();
        scanner.nextLine();

        System.out.println("ok, e qual sua altura?");
        float altura = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Ual! "+palavra+ " sua idade é: " + idade + " e sua altura é: "+altura);

    }

}