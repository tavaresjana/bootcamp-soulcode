package aula1803;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetList {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        Set<String> nomes = new LinkedHashSet<>();
        //Set<String> nomes = new TreeSet<>();
        //Set<String> nomes = new HashSet<>();

        nomes.add("Rafael");
        nomes.add("Ludmila");
        nomes.add("Ana Paula");
        nomes.add("Rafael");
        nomes.add("Lays");
        nomes.add("RAFAEL");

        System.out.println("lista de nomes: "+nomes);
    }
}
