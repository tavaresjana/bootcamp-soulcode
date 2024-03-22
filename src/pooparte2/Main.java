package pooparte2;

import pooparte1.Animal;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Maria", 25);
        Pessoa p2 = new Pessoa("Ana", 56);

        System.out.println("O nome da pessoa 1 é " + p1.getNome());
        System.out.println("A idade da pessoa 1 é " + p1.getIdade());
        p1.aniversarioPessoa();
        System.out.println("Agora a idade da pessoa 1, " + p1.getNome() + ", é " + p1.getIdade());

        System.out.println("\nO nome da pessoa 2 é " + p2.getNome());
    }

}
