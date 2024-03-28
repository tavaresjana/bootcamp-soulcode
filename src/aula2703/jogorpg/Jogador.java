package aula2703.jogorpg;

public class Jogador {
   private int vida;
   private int ataque;
   private int defesa;

    public Jogador(int vida, int ataque, int defesa) {
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public boolean statusVida(){
        return vida>0;
    }

    public void atacar(Inimigo inimigo){
        int dano = ataque-defesa;
        int vidaInimigo = inimigo.getVida();
        vidaInimigo -= dano;
        inimigo.setVida(vidaInimigo);
        System.out.println("Você atacou o inimigo e tirou "+dano+" de vida.");
    }
    public void alterarAtributos(int novaVida, int novoAtaque, int novaDefesa){
        this.vida = novaVida;
        this.ataque = novoAtaque;
        this.defesa = novaDefesa;
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
