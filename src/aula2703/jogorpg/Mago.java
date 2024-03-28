package aula2703.jogorpg;

public class Mago extends Jogador{

    public Mago(int vida, int ataque, int defesa) {
        super(vida, ataque, defesa);
    }
    @Override
    public void alterarAtributos(int novaVida, int novoAtaque, int novaDefesa) {
        super.alterarAtributos(100, 10, 4);
    }
}
