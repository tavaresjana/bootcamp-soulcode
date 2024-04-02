package aula0204.aulainterface;

public class Atleta implements Nadador, Corredor {

    @Override
    public void nadar() {
        System.out.println("Nadando \uD83C\uDFCA\uD83C\uDFFC");
    }

    @Override
    public void correr() {
        System.out.println("Correndo \uD83C\uDFC3\uD83C\uDFFB\u200D");
    }
}
