package aula2703.jogorpg;

import java.util.Random;

public class Inimigo extends Jogador{

    public Inimigo() {
        super(80, 15, 10);
    }

    public int escolherAcaoInimigo() {
        Random random = new Random();
        int escolhaInimigo = random.nextInt(2) + 1;
        return escolhaInimigo;
    }

}