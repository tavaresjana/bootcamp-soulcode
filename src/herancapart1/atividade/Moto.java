package herancapart1.atividade;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, String modelo, String cor, int ano, int cilindradas) {
        super(marca, modelo, cor, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Clindradas: "+cilindradas);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
