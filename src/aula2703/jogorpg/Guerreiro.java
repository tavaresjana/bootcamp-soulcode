package aula2703.jogorpg;

public class Guerreiro extends Jogador {
    private static String nomeClasse = "Guerreiro";
    public Guerreiro() {
        super(80, 15, 12);
    }

    public Guerreiro(String nome) {
        super(80, 15, 12, nome);
    }

    public static String getNomeClasse() {
        return nomeClasse;
    }

}