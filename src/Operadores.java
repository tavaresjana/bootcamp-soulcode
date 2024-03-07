public class Operadores {
    public static void main(String[] args) {
        System.out.println("__________________________________");
        int n1, n2, soma, multi, sub;
        double div;

        n1 = 10;
        n2 = 15;
        soma = n1 + n2;

        System.out.println("Resultado da soma: " + soma);
        multi = n1 * n2;
        System.out.println("Resultado da multi: " + multi);
        sub = n1 - n2;
        System.out.println("Resultado da sub: " + sub);
        div = (double) n2 / n1;
        System.out.println("Resultado da div: " + div);

        System.out.println("__________________________________");
        int resultado = (((5 + 4) * 3) - 2);
        System.out.println("Primeiro exemplo: " + resultado);

        System.out.println("__________________________________");
        int a = 5, b = 3;
        ++a; //6
        --b; //2
        System.out.println("Pré incremento: " + a);
        System.out.println("Pré decremento: " + b);

        System.out.println("__________________________________");
        int x = 8;

        System.out.println("Pós Incremento teste 1: " + x++);
        System.out.println("Pós Incremento teste 2: " + x++);

    }
}
