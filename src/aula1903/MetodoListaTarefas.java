package aula1903;

import java.util.ArrayList;
import java.util.Scanner;

public class MetodoListaTarefas {

    static Scanner leitura = new Scanner(System.in);
    static ArrayList<String> tarefas = new ArrayList<>();
    static ArrayList<String> tarefasDeletadas = new ArrayList<>();

    static String retorno;

    public static void imprimirMensagem(String msg){
        System.out.println(msg);
    }
    public static void adicionarTarefa() {
        System.out.println("Você escolheu ADICIONAR uma tarefa.");
        System.out.println("Digite a tarefa que você deseja adicionar");
        tarefas.add(leitura.nextLine());
        imprimirMensagem("Tarefa cadastrada com sucesso!");
    }

    public static void excluirTarefa(){
        if(tarefas.isEmpty()){
            System.out.println("Não há tarefas para excluir.");
        } else {
            System.out.println("Você escolheu EXCLUIR tarefa.");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println("Indice " + (i + 1) + " Tarefa: " + tarefas.get(i));
            }
            System.out.println("Digite o numero da tarefa que deseja excluir: ");
            int apagar = leitura.nextInt();

            tarefasDeletadas.add(tarefas.get(apagar - 1));
            tarefas.remove(apagar - 1);

            imprimirMensagem("Tarefa deletada com sucesso!");
        }
    }

    public static void exibirTarefas() {
        if(tarefas.isEmpty()){
            System.out.println("Não há tarefas para exibir.");
        } else {
            System.out.println("Você escolheu EXIBIR tarefas.");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println(" Tarefa " + (i + 1) + ": " + tarefas.get(i));
            }
        }
    }
    public static void exibirTarefasExcluidas() {
        if(tarefasDeletadas.isEmpty()){
            System.out.println("Nenhuma tarefa foi excluída.");
        } else {
            System.out.println("Você escolheu exibir lista de TAREFAS EXCLUÍDAS.");
            for (int i = 0; i < tarefasDeletadas.size(); i++) {
                System.out.println(" Tarefa: " + (i + 1) + " " + tarefasDeletadas.get(i));
            }
        }
    }



    public static void main(String[] args) {

        int opcao =0;

        do {
            System.out.println("\n ░ ▒ ▓ MENU PRINCIPAL ░ ▒ ▓");
            System.out.println("\nDigite 1 - Adicionar Tarefas" +
                    "\nDigite 2 - Excluir tarefas" +
                    "\nDigite 3 - Exibir tarefas" +
                    "\nDigite 4 - Exibir tarefas excluídas" +
                    "\nDigite 5 - sair");

            opcao = leitura.nextInt();
            leitura.nextLine();


            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    excluirTarefa();
                    break;
                case 3:
                   exibirTarefas();
                    break;
                case 4:
                    exibirTarefasExcluidas();
                    break;
                case 5:
                    imprimirMensagem("Você escolheu SAIR");
                    break;
                default:
                    imprimirMensagem("Digite uma opção válida.");
            }
        } while (opcao!=5);

    }
}
