package aula2703.contabancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("Maria", 5412, 10.00f);
        System.out.println("Saldo: "+cb.getSaldo());
        cb.depositar(10.00f);
        cb.sacar(5.00f);
    }
}
