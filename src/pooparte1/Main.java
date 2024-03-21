package pooparte1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Black", 2);
        Animal animal2 = new Animal("Meribaste", 10);

        System.out.println("O nome do animal1 é " + animal1.getNome());
        System.out.println("A idade do animal1 é " + animal1.getIdade());
        animal1.aniversarioAnimal();
        System.out.println("Agora a idade do animal1, " + animal1.getNome() + ", é " + animal1.getIdade());

        System.out.println("\nO nome do animal2 é " + animal2.getNome());
    }

}
