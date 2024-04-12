package aula1104;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    List<Pais> paises = new ArrayList<>();

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }

    public void adicionarPais(Pais pais) {
        this.paises.add(pais);
    }

    public void removerPais(Pais pais) {
        this.paises.remove(pais);
    }

    public void exibirPaises() {
        for (int i = 0; i < paises.size(); i++) {
            System.out.println(paises.get(i).getNome());
        }
    }

    public int populacaoTotalContinente() {
        int populacaoTotal = 0;
        for (int i = 0; i < paises.size(); i++) {
            int populacao = paises.get(i).getPopulacao();
            populacaoTotal += populacao;
        }
        return populacaoTotal;
    }

    public double dimensaoTotalContinente() {
        double dimensaoTotal = 0.00;
        for (int i = 0; i < paises.size(); i++) {
            double area = paises.get(i).getArea();
            dimensaoTotal += area;
        }
        return dimensaoTotal;
    }

    public double densidadePopulalcionalContinente() {
        double populacaoTotal = populacaoTotalContinente();
        double dimensaoTotal = dimensaoTotalContinente();
        double densidadePopulacional = populacaoTotal / dimensaoTotal;

        //String densidadePopulacionalString = String.format("%.2f",densidadePopulacional);
        //densidadePopulacionalString;
        return densidadePopulacional;
    }

    public String paisMaiorPopulacaoContinente() {
        Pais paisMaiorPopulacao = paises.get(0);
        for (int i = 1; i < paises.size(); i++) {
            Pais paisAtual = paises.get(i);
            if (paisAtual.getPopulacao() > paisMaiorPopulacao.getPopulacao()) {
                paisMaiorPopulacao = paisAtual;
            }
        }
        return paisMaiorPopulacao.getNome();

    }

    public String paisMenorPopulacaoContinente() {
        Pais paisMenorPopulacao = paises.get(0);
        for (int i = 1; i < paises.size(); i++) {
            Pais paisAtual = paises.get(i);
            if (paisAtual.getPopulacao() < paisMenorPopulacao.getPopulacao()) {
                paisMenorPopulacao = paisAtual;
            }
        }
        return paisMenorPopulacao.getNome();

    }

    public String paisMaiorDimensaoTerritorial() {
        Pais paisMaiorDimensao = paises.get(0);
        for (int i = 1; i < paises.size(); i++) {
            Pais paisAtual = paises.get(i);
            if (paisAtual.getArea() > paisMaiorDimensao.getArea()) {
                paisMaiorDimensao = paisAtual;
            }
        }
        return paisMaiorDimensao.getNome();
    }

    public String paisMenorDimensaoTerritorial() {
        Pais paisMenorDimensao = paises.get(0);
        for (int i = 1; i < paises.size(); i++) {
            Pais paisAtual = paises.get(i);
            if (paisAtual.getArea() < paisMenorDimensao.getArea()) {
                paisMenorDimensao = paisAtual;
            }
        }
        return paisMenorDimensao.getNome();
    }

    public double razaoTerritorialEntreMenorMaior() {
        Pais paisMaior = paises.get(0);
        Pais paisMenor = paises.get(0);

        for (int i = 1; i < paises.size(); i++) {
            Pais paisAtual = paises.get(i);
            if (paisAtual.getArea() > paisMaior.getArea()) {
                paisMaior = paisAtual;
            }
            if (paisAtual.getArea() < paisMenor.getArea()) {
                paisMenor = paisAtual;
            }
        }

        double razaoTerritorial = paisMaior.getArea() / paisMenor.getArea();
        return razaoTerritorial;

    }


}
