package aula1803;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicos2 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        String nome = "teste";

        System.out.println("Digite nomes e digite 'sair' para finalizar a operação.");

        while (true){
            System.out.println("Digite o nome: ");
            nome = leitura.nextLine();

            if(nome.equalsIgnoreCase("sair")){
                break;
            }
            nomes.add(nome);
        }

        for (String nomeLista : nomes){
            System.out.println(nomeLista);
        }

        String procurarNome = "Rafael";

        System.out.println("\nNome com letra minuscula: "+procurarNome.toLowerCase());
        System.out.println("\nNome com eltra maiuscula: "+procurarNome.toUpperCase());

        if(nomes.contains(procurarNome)){
            System.out.println("\nSim, o nome "+ procurarNome + " existe no array");
        } else {
            System.out.println("\no nome "+ procurarNome + " NÃO existe no array");
        }
    }
}
