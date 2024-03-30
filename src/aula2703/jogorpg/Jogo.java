package aula2703.jogorpg;

import java.util.Scanner;

public class Jogo {

    Scanner scanner = new Scanner(System.in);

    Inimigo inimigo = new Inimigo();

    Guerreiro guerreiro = new Guerreiro();
    Mago mago = new Mago();

    public void iniciarJogo() {
        System.out.println("--------------------------------------------------------");
        System.out.println("\u001B[1mSeja bem-vindo ao reino de Eldoria corajoso aventureiro!\u001B[0m");
        System.out.println("--------------------------------------------------------");
        System.out.println("Estamos passando por tempos sombrios, pois nosso reino foi invadido pelo Senhor das Sombras.\n" +
                "Estamos muito felizes em contar com sua ajuda nessa batalha.\n");
        System.out.println("Para começar sua jornada escolha" +
                " a classe do seu personagem.\n" +
                "Digite o número correspodente com a classe para selecionar: \n"
                + "(1) Guerreiro \n" + "(2) Mago");
        guerreiro.mostrarAtributosPersonagem(guerreiro.getNomeClasse());
        mago.mostrarAtributosPersonagem(mago.getNomeClasse());
        int opcaoJogador = scanner.nextInt();

        switch (opcaoJogador) {
            case 1:
                batalhar(guerreiro, inimigo);
                break;
            case 2:
                batalhar(mago, inimigo);
                break;
            default:
                System.out.println("Selecione uma opção válida.");
        }
    }

    public void batalhar(Jogador jogador, Inimigo inimigo) {
        System.out.println("-------------------------------------------------");
        System.out.println("Agora escolha um nome para o seu personagem.");
        System.out.println("-------------------------------------------------");
        scanner.nextLine();
        String nome = scanner.nextLine();
        System.out.println("-------------------------------------------------");
        System.out.println("\u001B[1mJogador(a) \u001B[0m" + nome + "\u001B[1m prepare-se para a batalha! \u001B[0m");
        System.out.println("-------------------------------------------------\n");

        while (jogador.statusVida() && inimigo.statusVida()) {
            int escolhaJogador = jogador.escolherAcao();
            int escolhaInimigo = inimigo.escolherAcaoInimigo();

            if (escolhaJogador == 1 && escolhaInimigo == 1) {
                jogador.mudarValorAtaque(inimigo);
                jogador.atacar(inimigo);
                inimigo.atacar(jogador, inimigo);
            } else if (escolhaJogador == 1 && escolhaInimigo == 2) {
                System.out.println("------------------------------------");
                System.out.println("O inimigo se defendeu do seu ataque!");
                System.out.println("------------------------------------\n");
            } else if (escolhaJogador == 2 && escolhaInimigo == 1) {
                System.out.println("-----------------------------");
                System.out.println("Você se defendeu!");
                System.out.println("-----------------------------\n");
            } else if (escolhaJogador == 2 && escolhaInimigo == 2) {
                System.out.println("-----------------------------");
                System.out.println("Você se defendeu!");
                System.out.println("-----------------------------");
                System.out.println("O inimigo também se defendeu!");
                System.out.println("-----------------------------\n");
            }
        }

        if (jogador.statusVida()) {
            System.out.println("--------------------------------");
            System.out.println("\u001B[32m" + "Parabéns!!! Você venceu a batalha!" + "\u001B[0m");
            System.out.println("--------------------------------");
        } else {
            System.out.println("-------------------");
            System.out.println("\u001B[31m" + "Você foi derrotado!" + "\u001B[0m");
            System.out.println("-------------------");
        }
    }
}