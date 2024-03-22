package aula2103;

public class Suprimentos {
    private int numeroFaturamento;
    private String descricao;
    private int quantidadeComprada;
    private double preco;

    public Suprimentos(int numeroFaturamento, String descricao, int quantidadeComprada, double preco) {
        if(preco <0){
            preco = 0.00;
            this.preco = preco;
        }
        if(quantidadeComprada < 0){
            quantidadeComprada=0;
            this.quantidadeComprada = quantidadeComprada;
        }
        this.numeroFaturamento = numeroFaturamento;
        this.descricao = descricao;
        this.quantidadeComprada = quantidadeComprada;
        this.preco = preco;
    }


    public double getInvoiceAmount(){
        double fatura = preco * quantidadeComprada;
        return fatura;
    }

    public int getNumeroFaturamento() {
        return numeroFaturamento;
    }

    public void setNumeroFaturamento(int numeroFaturamento) {
        this.numeroFaturamento = numeroFaturamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
