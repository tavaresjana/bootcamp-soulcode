import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        ArrayList<String> tarefasDeletadas = new ArrayList<>();

        while (true) {
            System.out.println("~~~~~ MENU PRINCIPAL ~~~~~");
            System.out.println("\nDigite 1 - Adicionar Tarefas" +
                    "\nDigite 2 - Remover tarefas" +
                    "\nDigite 3 - Exibir tarefas" +
                    "\nDigite 3 - Exibir tarefas excluídas" +
                    "\nDigite 3 - sair");

            int opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu ADICIONAR uma tarefa.");
                    System.out.println("Digite a tarefa que você deseja adicionar");
                    tarefas.add(leitura.nextLine());
                    System.out.println("Cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Você escolheu EXCLUIR tarefa.");
                    for (int i=0; i<tarefas.size(); i++){
                        System.out.println("Indice "+ (i+1) + " Tarefa: " + tarefas.get(i));
                    }
                    System.out.println("Digite o numero da tarefa que deseja apagar: ");
                    int apagar = leitura.nextInt();

                    tarefasDeletadas.add(tarefas.get(apagar-1));

                    tarefas.remove(apagar-1);
                    System.out.println("Deletado com sucesso!");

                    break;
                case 3:
                    System.out.println("Você escolheu EXIBIR tarefas.");
                    for (int i=0; i<tarefas.size(); i++){
                        System.out.println(" Tarefa: "+ (i+1) +" " + tarefas.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Você escolheu exibir lista de TAREFAS EXCLUÍDAS.");
                    for (int i=0; i<tarefasDeletadas.size(); i++){
                        System.out.println(" Tarefa: "+ (i+1) +" " + tarefasDeletadas.get(i));
                    }
                    break;
                case 5:
                    System.out.println("Você escolheu SAIR.");
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
            }
        }

    }
}
