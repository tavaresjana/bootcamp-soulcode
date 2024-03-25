package herancapart1;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua das flores", "São Paulo", "SP");
        Pessoa p1 = new Pessoa("Maria", 25, endereco);
        p1.mostrarDados();
        System.out.println("");
        Estudante e1 = new Estudante("Rafael Estudante", 32, 321123, new Endereco("Rua das Frutas", "Rio de Janeiro", "SP"));
        e1.mostrarDados2();



    }
}
