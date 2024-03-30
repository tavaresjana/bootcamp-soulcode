package aula2703.jogorpg;

public class Guerreiro extends Jogador {
    private static String nomeClasse = "Guerreiro";
    public Guerreiro() {
        super(100, 15, 12);
    }

    public Guerreiro(String nome) {
        super(100, 15, 20, nome);
    }

    public static String getNomeClasse() {
        return nomeClasse;
    }

}