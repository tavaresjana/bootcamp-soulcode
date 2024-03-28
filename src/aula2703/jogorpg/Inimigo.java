package aula2703.jogorpg;

public class Inimigo {
    private int vida;
    private int ataque;
    private int defesa;

    public Inimigo(int vida, int ataque, int defesa) {
        this.vida = 100;
        this.ataque = 10;
        this.defesa = 4;
    }

    public boolean statusVida(){
        return vida>0;
    }

    public void atacar(Jogador jogador) {
        int dano = ataque - defesa;
        int vidaJogador = jogador.getVida();
        vidaJogador -= dano;
        jogador.setVida(vidaJogador);
        System.out.println("Você atacou o jogador e tirou " + dano + " de vida.");
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
}
