package aula2003;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ExerciciosMetodos {
    static Scanner scanner = new Scanner(System.in);

    public static void contagemRegressiva() {
        System.out.println("1 -Crie um programa que realize uma contagem regressiva de 10 até 1, mostrando cada número na tela.");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void tabuada() {
        System.out.println("2 - Escreva um programa que solicite um número ao usuário e exiba a tabuada desse número de 1 a 10.");
        System.out.println("Por favor, informe um número: ");
        int numero = scanner.nextInt();

        System.out.println("TABUADA DO " + numero);
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static String somaPares(int n1, int n2) {
        System.out.println("3 - Desenvolva um algoritmo que calcule a soma dos números pares de 1 a 100.");

        int soma = 0;
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        return "O total da soma dos números pares de " + n1 + " a " + n2 + " é: " + soma;
    }

    public static void numeroPrimo() {
        System.out.println("4 - Escreva um programa que verifique se um número digitado pelo usuário é primo ou não.");

        int contador = 0;

        System.out.println("Digite um número: ");
        int numerop = scanner.nextInt();

        if (numerop <= 1) {
            System.out.println(numerop + " não é um número primo.");
        } else {
            for (int i = 2; i < numerop; i++) {
                if (numerop % i == 0) {
                    contador++;
                }
            }
            String retorno = (contador == 0) ? numerop + " é um número primo." : numerop + " não é um número primo.";

            System.out.println(retorno);
        }

    }

    public static void fibonacci() {
        System.out.println("5 - Implemente um algoritmo que exiba os primeiros 20 números da sequência de Fibonacci.");

        int n1 = 0, n2 = 1;

        System.out.println("Sequência de Fibonacci:");
        System.out.print(n1 + ", " + n2);

        for (int i = 2; i < 20; i++) {
            int next = n1 + n2;
            System.out.print(", " + next);
            n1 = n2;
            n2 = next;
        }
    }

    public static void numerosInteirosMedia() {
        System.out.println("6- Faça um programa que solicite ao usuário números inteiros positivos. Quando o usuário digitar um número negativo, o programa deve exibir a média dos números inseridos até aquele momento.");

        double somatoria = 0;
        int cont = 0;
        double num;

        do {
            System.out.print("Digite um número: ");
            num = scanner.nextDouble();

            if (num >= 0) {
                somatoria += num;
                cont++;
            }
        } while (num >= 0);

        if (cont > 0) {
            double media = somatoria / cont;
            System.out.println("A média dos números inseridos é: " + media);
        } else {
            System.out.println("Nenhum número positivo foi inserido.");
        }
    }

    public static void calculadora() {
        System.out.println("7 - Crie uma calculadora simples que permita ao usuário realizar operações de soma, subtração, " +
                "multiplicação e divisão entre dois números, utilizando um laço de repetição para continuar operando até que " +
                "o usuário decida sair.");

        double num1 = 0, num2 = 0, somar, sub, div, mult, res;
        int selecao = 0;

        for (int i = 0; selecao != 5; i++) {
            System.out.println("");
            System.out.println("Escolha qual operação deseja efetuar. " +
                    "\nDigite 1 - SOMA" +
                    "\nDigite 2 - SUBTRAÇÃO" +
                    "\nDigite 3 - MULTIPLICAÇÃO" +
                    "\nDigite 4 - DIVISÃO" +
                    "\nDigite 5 - sair");
            selecao = scanner.nextInt();

            if (selecao != 5) {
                System.out.println("Informe o primeiro número para operação: ");
                num1 = scanner.nextDouble();

                System.out.println("Informe o segundo número para operação: ");
                num2 = scanner.nextDouble();
            }

            switch (selecao) {
                case 1:
                    somar = num1 + num2;
                    System.out.println("Você escolheu efetuar uma SOMA. Resultado: " + somar);
                    break;
                case 2:
                    sub = num1 - num2;
                    System.out.println("Você escolheu efetuar uma SUBTRAÇÃO. Resultado: " + sub);
                    break;
                case 3:
                    mult = num1 * num2;
                    System.out.println("Você escolheu efetuar uma MULTIPLICAÇÃO. Resultado: " + mult);
                    break;
                case 4:
                    div = num1 / num2;
                    System.out.println("Você escolheu efetuar uma DIVISÃO. Resultado: " + div);
                    break;

                default:
                    System.out.println("Você optou por encerrar");
                    break;
            }
        }
    }

    public static void randomGame() {
        System.out.println("8- Implemente um jogo no qual o programa escolhe um número aleatório entre 1 e 100, e o " +
                "jogador deve tentar adivinhá-lo. O programa deve fornecer dicas do tipo \"maior\" ou \"menor\" conforme necessário.");

        Random random = new Random();
        int numerodasorte = random.nextInt(100) + 1;
        System.out.println("Você deve acertar o número que o robô está pensando entre 1 e 100... ");
        int palpite;

        do {
            System.out.println("Vamos ver se você acerta? Digite um número.");
            palpite = scanner.nextInt();

            if (palpite == numerodasorte) {
                System.out.println("\u001B[32mParabénssssss você acertou!\u001B[0m");
            } else if (palpite < numerodasorte) {
                System.out.println("Tente novamente. Mas agora tente um número maior.");
            } else {
                System.out.println("Tente novamente. Mas agora tente um número menor.");
            }
        } while (palpite != numerodasorte);
    }

    public static void temperatura() {
        System.out.println("9 -  Escreva um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa, solicitando ao usuário qual conversão deseja fazer. O programa deve continuar executando até que o usuário decida sair.");

        double celsius, fahrenheit, temp = 0;
        int select = 0;

        for (int i = 0; select != 3; i++) {
            System.out.println("Escolha qual conversão deseja efetuar. \nDigite 1 - CELSIUS para FAHRENHEIT  \nDigite 2 - FAHRENHEIT para CELSIUS  \nDigite 3 - sair");
            select = scanner.nextInt();
            scanner.nextLine();

            if (select != 3) {
                System.out.println("Informe a temperatura a ser convertida: ");
                temp = scanner.nextDouble();
            }

            switch (select) {
                case 1:
                    fahrenheit = (temp * 9 / 5) + 32;
                    System.out.println("Você escolheu converter de celsius para fahrenheit. Resultado: " + fahrenheit + " °F");
                    break;
                case 2:
                    celsius = (temp - 32) * 5 / 9;
                    System.out.println("Você escolheu converter de fahrenheit para celsius. Resultado: " + celsius + " °C");
                    break;
                default:
                    System.out.println("Você optou por encerrar");
                    break;
            }
        }
    }

    public static void listaTarefas() {
        System.out.println("10 - Desenvolva um programa que permita ao usuário inserir itens em uma lista de compras. O programa deve exibir a lista de compras atualizada após cada inserção e perguntar se o usuário deseja adicionar mais itens. O programa deve continuar executando até que o usuário decida sair.");

        ArrayList<String> compras = new ArrayList();
        String item = "";
        int opcao = 0;
        for (int i = 0; opcao != 2; i++) {
            System.out.println("{{{ Informe os itens da sua lista de compras }}}");
            item = scanner.nextLine();
            compras.add(item);
            System.out.println("* Sua lista de compras atualizada: " + compras);

            System.out.println("");

            System.out.println("{{{ Deseja continuar a adicionar mais itens ou sair? }}} \n1-continuar \n2-sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            System.out.println("");

            if (opcao == 2) {
                System.out.println("Você optou por sair. Sua lista de compras atualizada é: " + compras);
                break;
            }
        }
    }

    public static void main(String[] args) {

        contagemRegressiva();
        tabuada();
        System.out.println(somaPares(1, 100));
        numeroPrimo();
        fibonacci();
        numerosInteirosMedia();
        calculadora();
        randomGame();
        listaTarefas();

    }
}
