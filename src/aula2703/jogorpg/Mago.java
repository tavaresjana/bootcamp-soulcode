package aula2703.jogorpg;

public class Mago extends Jogador {
    private static String nomeClasse = "Mago";

    public Mago() {
        super(100, 20, 15);
    }

    public Mago(String nome) {
        super(100, 20, 8, nome);
    }

    public static String getNomeClasse() {
        return nomeClasse;
    }

}

