package herancapart1;

public class Estudante extends Pessoa {

    private int matricula;

    public Estudante(String nome, int idade, int matricula, Endereco endereco) {
        super(nome, idade, endereco);
        this.matricula = matricula;
    }


    public void mostrarDados2() {
        super.mostrarDados();
        System.out.println("Matrícula = "+matricula);
    }
}
