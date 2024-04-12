package aula1104;

import java.util.Scanner;

public class MainContador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor para inicializar o contador: ");
        int valor = scanner.nextInt();
        scanner.nextLine();

        Contador contador = new Contador(valor);
        contador.retornarValor();

        contador.zerar();
        contador.retornarValor();

        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        contador.retornarValor();

    }
}
