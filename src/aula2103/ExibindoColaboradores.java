package aula2103;

import java.text.DecimalFormat;

public class ExibindoColaboradores {

    public static void main(String[] args) {

        DecimalFormat formato = new DecimalFormat("#.##");

        Colaborador c1 = new Colaborador("Jana", "Silva", 20.00);
        System.out.println("Colaborador 1:");
        System.out.println("nome: " + c1.getNome());
        System.out.println("sobrenome: " + c1.getSobrenome());
        System.out.println("salário: " + c1.getSalario());

        System.out.println("Salário anual do colaborador(a) " + c1.getNome() + ": R$ " + c1.salarioAnual());
        c1.ajusteSalarial();
        System.out.println("Salário anual do colaborador após ajuste: " + c1.getNome() + ", R$ " + c1.salarioAnual());


        Colaborador c2 = new Colaborador("Anna", "Avlis", 50.00);
        System.out.println("\nColaborador 2:");
        System.out.println("nome: " + c2.getNome());
        System.out.println("sobrenome: " + c2.getSobrenome());
        System.out.println("salário: " + (Double.valueOf(formato.format(c2.getSalario()))));

        System.out.println("Salário anual do colaborador(a) " + c2.getNome() + ": R$ " + c2.salarioAnual());
        c2.ajusteSalarial();
        System.out.println("Salário anual do colaborador após ajuste: " + c2.getNome() + ", R$ " + (Double.valueOf(formato.format(c2.salarioAnual()))));

        //mostrando que a lógica de cadastrar com valor 0.00 quando for informado um valor negativo para salario
        Colaborador c3 = new Colaborador("Bella", "Swan", (Double.valueOf(formato.format(-20.00))));
        System.out.println("\nColaborador 3:");
        System.out.println("nome: " + c3.getNome());
        System.out.println("sobrenome: " + c3.getSobrenome());
        System.out.println("salário: " + c3.getSalario());
    }
}
