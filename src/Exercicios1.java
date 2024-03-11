import java.util.Scanner;

public class Exercicios1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Seu nome é "+nome+" e sua idde é "+idade);

       System.out.println("__________________________________");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Informe dois números:");
        double num1 = scanner1.nextDouble();
        double num2 = scanner1.nextDouble();

        double soma = num1 + num2;
        double sub = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;

        System.out.println("O resultado da soma é "+soma+"\n"+
                "O resultado da subtração é "+sub+"\n"+
                "O resultado da multiplicação é "+mult+"\n"+
                "O resultado da divisão é "+div);

        System.out.println("__________________________________");
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = scanner2.nextInt();

        if(num < 0){
            System.out.println(num+" é um número negativo.");
        } else if( num > 0){
            System.out.println(num+" é um número positivo.");
        } else {
            System.out.println("O número é 0.");
        }

        System.out.println("__________________________________");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número correspondente a um dia da semana considerando o (1) Domingo: ");
        int diaSemana = sc.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número do dia é inválido.");
        }

        System.out.println("__________________________________");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int numero = sc1.nextInt();

        if(numero > 0){
            System.out.println(numero+" é um número positivo.");
        } else if(numero < 0){
            System.out.println(numero+" é um número negativo.");
        }

        switch (numero % 2) {
            case 0:
                System.out.println(numero+" é um número par");
                break;
            case 1:
                System.out.println(numero+" é um número ímpar");
                break;
            default:
                System.out.println(numero+" é um número inválido.");
        }

        System.out.println("__________________________________");
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Informe o valor total da sua compra: ");
        double total = scanner3.nextDouble();
        double resultado =0;
        if(total > 200.00){
            double desc = total * 0.1;
            resultado = total - desc;
            System.out.println("Desconto de 10%. Valor total é: "+resultado);
        } else if(total >= 100.00 && total <= 200.00){
            double desc = total * 0.05;
            resultado = total - desc;
            System.out.println("Desconto de 5%. Valor total é: "+resultado);
        } else {
            System.out.println("O valor total é: "+total);
        }

        System.out.println("Qual método de pagamento?\n" +
                "Opção 1: Cartão de crédito\n" +
                "Opção 2: Boleto bancário\n" +
                "Opção 3: Transferência bancária");
        int pag = scanner3.nextInt();
        String forma;
        switch (pag) {
            case 1:
                forma="Cartão de crédito";
                break;
            case 2:
                forma="Boleto bancário";
                break;
            case 3:
                forma="Transferência bancária";
            default:
                forma="Opção inválida.";
        }

        System.out.println("O valor total da sua compra é: "+resultado+" e a forma de pagamento escolhida: "+forma);

    }
}
