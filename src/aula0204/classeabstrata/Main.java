package aula0204.classeabstrata;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.fazerBarulho();
        cachorro.dormir();

        System.out.println("");

        Gato gato = new Gato();
        gato.fazerBarulho();
        gato.dormir();
    }
}
