package aula0603;

import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {

        /*1- Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.*/
        System.out.println("__________________________________");
        System.out.println("1 - Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.");
        System.out.println("");

        int num1 = 8, num2 = 9, num3 = 7, total;
        double media1, media2, soma;
        media1 = (double) (num1 + num2 + num3) / 3;
        System.out.println("Resultado da média dos números 8, 9 e 7: " + media1);

        int num4 = 4, num5 = 5, num6 = 6;
        media2 = (double) (num4 + num5 + num6) / 3;
        System.out.println("Resultado da média dos números 4, 5 e 6: " + media2);

        soma = media1 + media2;
        System.out.println("Resultado da soma das duas médias: " + soma);

        double media3 = soma / 2;
        System.out.println("Resultado da média das médias: " + media3);

        /*2 - Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.*/
        System.out.println("__________________________________");
        System.out.println("2 - Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe um número: ");
        int numero = scanner.nextInt();

        int numeroAnt = numero - 1;
        int numeroSuc = numero + 1;
        System.out.println("Você informou o número " + numero + ". O número antecessor desse número é: " + numeroAnt + " e o número sucessor desse número é: " + numeroSuc);

        /*3 - Crie um codigo que contenha 3 operações matematicas de sua escolha.*/
        System.out.println("__________________________________");
        System.out.println("3 - Crie um codigo que contenha 3 operações matematicas de sua escolha.");
        System.out.println("");
        int n1 = 5, n2 = 10, n3 = 15;
        double res;

        int somatoria = n1 + n2;
        int subtracao = n3 - n2;
        int multi = somatoria * subtracao;
        System.out.println("Foi feito uma somatoria do numero: " + n1 + " + " + n2 + " = " + somatoria);
        System.out.println("Foi feito uma subtracao do numero: " + n3 + " - " + n2 + " = " + subtracao);
        System.out.println("Foi feito uma multiplicação do numero: " + somatoria + " * " + subtracao + " = " + multi);

        /*4 - Desenvolva um codigo que solicite ao usuario seu Nome, Sobrenome, Idade, Endereço e ao final mostre todos os dados informados.*/
        System.out.println("__________________________________");
        System.out.println("4 - Desenvolva um codigo que solicite ao usuario seu Nome, Sobrenome, Idade, Endereço e ao final mostre todos os dados informados.");
        System.out.println("");

        System.out.println("Informe seu nome: ");
        String nomes = scanner.next();
        scanner.nextLine();

        System.out.println("Informe seu sobrenome: ");
        String sobrenome = scanner.nextLine();


        System.out.println("Informe seu idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe seu endereço: ");
        String endereco = scanner.nextLine();


        System.out.println("Os dados foram informados foram: " + nomes + " " + sobrenome + ", " + idade + ", " + endereco);

        /*5 - Crie um algoritmo que cadastra o nome e a idade de um usuario, após o cadastro mostre em que ano esse usuario nasceu.*/
        System.out.println("__________________________________");
        System.out.println("5 - Crie um algoritmo que cadastra o nome e a idade de um usuario, após o cadastro mostre em que ano esse usuario nasceu.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome1 = sc.nextLine();

        System.out.println("Informe seu idade: ");
        int idade1 = sc.nextInt();

        int resposta = 2024 - idade1;
        System.out.println(nome1 + ", você nasceu no ano de " + resposta);
    }
}
