package aula2703.contabancaria;

public class ContaBancaria {

    private String cliente;
    private int numConta;
    private float saldo;

    public ContaBancaria(String cliente, int numConta, float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(float valor){

        if(saldo-valor >= 0){
            saldo -= valor;
            System.out.println("Você efetuou um saque de R$ "+valor+". Seu saldo atual é R$ "+saldo);

        } else {
            System.out.println("Ops, não é possível efetuar o saque desse valor, " +
                    "pois a conta ficará negativada. Seu saldo atual é R$ "+saldo);
        }
    }

    public void depositar(float valor){
        float saldotemp = saldo;
        saldo = saldotemp + valor;
        System.out.println("Seu depósito no valor de R$ "+valor+" foi efetuado. Seu saldo atual é R$ "+saldo);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
