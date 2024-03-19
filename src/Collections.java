import java.util.ArrayList;
import java.util.Scanner;

public class Collections {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        ArrayList<String> listaNomes = new ArrayList<>();

        listaNomes.add("Joana D'arc");
        listaNomes.add("Jéssica");
        listaNomes.add("Érica");

        System.out.println("Lista de nomes: "+listaNomes);

        System.out.println("\nMostrando todos elementos: ");
        //a cada nome encontrado na listaNomes sysout
        for(String nome : listaNomes){
            System.out.println(nome);
        }

        System.out.println("\nQual você deseja apagar?");
        int deletar = leitura.nextInt();
        leitura.nextLine();

        ArrayList<String> listaNomesExcluidos = new ArrayList<>();

        listaNomesExcluidos.add(listaNomes.get(deletar));

        //remover elemento
        listaNomes.remove(deletar);

        System.out.println("\nMostrando todos elementos após exclusão");
        for(String nome : listaNomes){
            System.out.println(nome);
        }

        System.out.println("\nLista de nomes excluidos: "+listaNomesExcluidos);
    }
}
