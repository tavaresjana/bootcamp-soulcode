package aula2703.jogorpg;

public class Mago extends Jogador{
    private static String nomeClasse = "Mago";
    public Mago() {
        super(80, 15,15);
    }
    public Mago(String nome) {
        super(80, 15,15, nome);
    }

    public static String getNomeClasse() {
        return nomeClasse;
    }

}

