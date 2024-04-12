package aula1104;

public class Pais {

    private String nome;
    private double area;
    private int populacao;

    public Pais() {
    }

    public Pais(String nome, Double area, int populacao) {
        this.nome = nome;
        this.area = area;
        this.populacao = populacao;
    }

    public Pais(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
}
