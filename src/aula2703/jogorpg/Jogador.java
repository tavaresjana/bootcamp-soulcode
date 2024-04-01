package aula2703.jogorpg;

import java.util.Random;
import java.util.Scanner;

public class Jogador {
    private int vida;
    private int ataque;
    private int defesa;
    private String nome;

    public Jogador(int vida, int ataque, int defesa) {
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public Jogador(int vida, int ataque, int defesa, String nome) {
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.nome = nome;
    }

    public Jogador() {

    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int escolherAcao() {
        System.out.println("------------------");
        System.out.println("Escolha sua ação:");
        System.out.println("1 - Atacar");
        System.out.println("2 - Defender");
        System.out.println("------------------");
        int escolha = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            escolha = scanner.nextInt();

            if (escolha >= 1 && escolha <= 2) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
        return escolha;
    }

    public void mudarValorAtaque(Inimigo inimigo) {
        int[] ataquesJogador = {15, 20, 25};
        int[] ataquesInimigo = {15, 20, 25};
        int escolhaAtaqueJogador = (int) (Math.random() * ataquesJogador.length);
        int escolhaAtaqueInimigo = (int) (Math.random() * ataquesInimigo.length);
        int ataqueEscolhidoJogador = ataquesJogador[escolhaAtaqueJogador];
        int ataqueEscolhidoInimigo = ataquesInimigo[escolhaAtaqueInimigo];
        setAtaque(ataqueEscolhidoJogador);
        inimigo.setAtaque(ataqueEscolhidoInimigo);
    }

    public void atacar(Inimigo inimigo) {
        Random random = new Random();
        int vidaInimigo = inimigo.getVida();
        int dano = ataque - ((inimigo.getDefesa() * ataque) / 100);
       //linha add p adicionar dinamicidade no dano
        dano+=random.nextInt(9) + 1;
        vidaInimigo -= dano;
        inimigo.setVida(vidaInimigo);
        if (ataque == 15) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Você atacou o inimigo com um golpe leve e tirou " + dano + " pontos de vida.");
            System.out.println("---------------------------------------------------------------------------");
        } else if (ataque == 20) {
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Você atacou o inimigo com uma explosão moderada e tirou " + dano + " pontos de vida.");
            System.out.println("-----------------------------------------------------------------------------------");
        } else if (ataque == 25) {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Você atacou o inimigo com um golpe fatal e tirou " + dano + " pontos de vida.");
            System.out.println("------------------------------------------------------------------------------");
        }
    }

    public void atacar(Jogador jogador, Inimigo inimigo) {
        Random random = new Random();
        int vidaJogador = jogador.getVida();
        int dano = inimigo.getAtaque() - ((jogador.getDefesa() * inimigo.getAtaque()) / 100);
        //linha add p adicionar dinamicidade no dano
        dano+=random.nextInt(9) + 1;
        vidaJogador -= dano;
        jogador.setVida(vidaJogador);
        if (inimigo.getAtaque() == 15) {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("O inimigo te atacou com um golpe leve e tirou " + dano + " pontos de vida.");
            System.out.println("--------------------------------------------------------------------------");
        } else if (inimigo.getAtaque() == 20) {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("O inimigo te atacou com uma explosão moderada e tirou " + dano + " pontos de vida.");
            System.out.println("----------------------------------------------------------------------------------");
        } else if (inimigo.getAtaque() == 25) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("O inimigo te atacou com um golpe fatal e tirou " + dano + " pontos de vida.");
            System.out.println("----------------------------------------------------------------------------");
        }
        if (jogador.statusVida() && inimigo.statusVida()) {
            System.out.println("Status jogo: \n" + "Jogador vida: " + jogador.getVida() + "\nInimigo vida: " + inimigo.getVida());
        }
    }

    public void mostrarAtributosPersonagem(String nomeClasse) {
        System.out.println("-------------------------");
        System.out.println("Classe: " + nomeClasse);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa + "%");
    }

    public boolean statusVida() {
        return vida >= 0;
    }

}