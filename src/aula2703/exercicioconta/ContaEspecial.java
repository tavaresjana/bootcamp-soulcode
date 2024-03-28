package aula2703.exercicioconta;

public class ContaEspecial extends ContaBancaria{

    private float limite;

    public ContaEspecial(String cliente, int numConta, float saldo, float limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor){
        float saldo= getSaldo();
        if(valor <= (saldo + Math.abs(limite))){
            saldo -= valor;
            setSaldo(saldo);
            System.out.println("Você efetuou um saque de R$ "+valor+". Seu saldo atual é R$ "+(saldo));

        } else {
            System.out.println("Ops, não é possível efetuar o saque no valor de R$ " +valor+
                    ", pois excede seu limite. Seu saldo atual é R$ "+saldo+". E seu " +
                    "crédito é de R$ "+(saldo+Math.abs(limite)));
        }
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}
