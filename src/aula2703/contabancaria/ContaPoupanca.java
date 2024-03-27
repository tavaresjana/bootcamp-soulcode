package aula2703.contabancaria;

public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;

    public ContaPoupanca(String cliente, int numConta, float saldo, int diaRendimento) {
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxa){
        float novoSaldo = getSaldo() * (1+ taxa/100);
        System.out.println("Seu saldo atualizado é R$ "+novoSaldo);
        setSaldo(novoSaldo);
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}
