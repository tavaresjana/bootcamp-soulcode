package herancapart1.atividade;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Honda", "Civic", "Prata", 2012);
        veiculo.exibirDados();
        System.out.println("");

        Carro carro = new Carro("Fiat", "Palio", "Preto", 1996, 4);
        carro.exibirDados();
        System.out.println("");

        Moto moto = new Moto("Yamaha", "Nmax", "Preto", 2001, 330);
        moto.exibirDados();
    }
}
