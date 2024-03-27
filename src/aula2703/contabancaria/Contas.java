package aula2703.contabancaria;

import java.sql.SQLOutput;

public class Contas {
    public static void main(String[] args) {
        System.out.println("[CONTA BANCÁRIA]");
        ContaBancaria cb = new ContaBancaria("Maria", 5412, 10.00f);
        System.out.println("Saldo: "+cb.getSaldo());
        cb.depositar(10.00f);
        cb.sacar(5.00f);
        System.out.println("Nome: "+cb.getCliente()+
                            "\nConta: "+cb.getNumConta()+
                            "\nSaldo: " +cb.getSaldo());

        System.out.println("\n[CONTA POUPANÇA]");
        ContaPoupanca cp = new ContaPoupanca("Ana", 5656565, 1000f, 2);
        System.out.println("Saldo: "+cp.getSaldo());
        cp.calcularNovoSaldo(5f);
        System.out.println("Nome: "+cp.getCliente()+
                "\nConta: "+cp.getNumConta()+
                "\nSaldo: " +cp.getSaldo());

        System.out.println("\n[CONTA ESPECIAL]");
        ContaEspecial ce = new ContaEspecial("Bia", 45415, 10.00f, 10.00f);
        System.out.println("Saldo: "+ce.getSaldo());
        ce.depositar(1f);
        ce.sacar(21.0f);
        System.out.println("Nome: "+ce.getCliente()+
                "\nConta: "+ce.getNumConta()+
                "\nSaldo: " +ce.getSaldo());
    }
}
