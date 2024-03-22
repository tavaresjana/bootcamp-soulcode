package aula2103;

import java.text.DecimalFormat;

public class Colaborador {

    private String nome;
    private String sobrenome;
    private Double salario;



    public Colaborador(String nome, String sobrenome, Double salario) {
        if(salario <0){
            salario = 0.00;
            this.salario = salario;
        }
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public double salarioAnual(){
      return salario * 12;
    }

    public void ajusteSalarial(){
        salario *= 1.10;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
