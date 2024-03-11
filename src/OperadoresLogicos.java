import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero que eu vou te dizer se é par ou ímpar: ");
        int parImpar = leitura.nextInt();

        if(parImpar % 2 == 0){
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        Scanner leituras = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idade = leituras.nextInt();

        if(idade >= 18){
            System.out.println("Bem vindo ao sistema");
        } else {
            System.out.println("Ops, você não pode acessar o sistema.");
        }

        Scanner leituranota = new Scanner(System.in);
        System.out.println("Qual a sua nota?");
        double nota = leituranota.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Você está Aprovado!");
        } else if (nota >= 6.0 && nota <= 7.0) {
            System.out.println("Você está de Recuperação.");

            System.out.println("Qual a sua nota da Recuperação?");
            double notaRec = leitura.nextDouble();

            if (notaRec >= 5.0) {
                System.out.println("Você foi Aprovado!");
            } else {
                System.out.println("Você foi Reprovado!");
            }

        } else if (nota < 6) {
            System.out.println("Você está Reprovado.");
        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual valor da sua hora de trabalho?");
        double valorHora = scanner.nextDouble();

        System.out.println("Qual a quantidade de horas trabalhadas no mês?");
        double horasTrab = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrab;

        System.out.println("Esse é o salário bruto: "+salarioBruto);

        double descSind = salarioBruto * 0.03;
        double descInss = salarioBruto * 0.1;
        double descFgts = salarioBruto * 0.11;
        double descIr =0;

        System.out.println("Salario bruto igual a "+horasTrab+" horas trabalhadas * "
                +valorHora+" valor hora. Igual a "+salarioBruto+" de salario.");


        if(salarioBruto <= 900.00){
            System.out.println("isento");
        } else if(salarioBruto <= 1500.00){
            descIr = salarioBruto * 0.05;
        } else if(salarioBruto <=2500.00){
            descIr = salarioBruto * 0.1;
        } else {
            descIr = salarioBruto * 0.2;
        }
        double totaldesc = (descInss+descIr)+descSind;

        System.out.println("IR: "+descIr);
        System.out.println("INSS: "+ descInss);
        System.out.println("FGTS: "+ descFgts);
        System.out.println("Total de descontos: "+(totaldesc));
        System.out.println("Salário liquido: "+(salarioBruto - totaldesc));



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
    }
}
