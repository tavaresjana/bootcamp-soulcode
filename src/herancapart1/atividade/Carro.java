package herancapart1.atividade;

public class Carro extends Veiculo {

    private int numeroPortas;


    public Carro(String marca, String modelo, String cor, int ano, int numeroPortas) {
        super(marca, modelo, cor, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Número de portas: "+ numeroPortas);
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

}
