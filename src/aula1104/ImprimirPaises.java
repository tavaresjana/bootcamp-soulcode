package aula1104;

public class ImprimirPaises {
    public static void main(String[] args) {

/*
a) Construtor que inicialize o nome do continente; ok
b) Um método que permita adicionar países aos continentes; ok
c) Um método que retorne a dimensão total do continente; ok
d) Um método que retorne a população total do continente; ok
e) Um método que retorne a densidade populacional do continente; ok
f) Um método que retorne o país com maior população no continente; ok
g) Um método que retorne o país com menor população no continente; ok
h) Um método que retorne o país de maior dimensão territorial no continente; ok
i) Um método que retorne o país de menor dimensão territorial no continente; ok
j) Um método que retorne a razão territorial do maior pais em relação ao menor país; ok
*/

        Continente americaSul = new Continente("América do Sul");
        Pais pais1 = new Pais("Brasil", 23.23, 818562);
        Pais pais2 = new Pais("Chile", 25.23, 1281);
        Pais pais3 = new Pais("Guiana", 27.23, 76182);
        Pais pais4 = new Pais("Argentina", 29.23, 9848182);

        System.out.println(americaSul.getNome());


        americaSul.adicionarPais(pais1);
        americaSul.adicionarPais(pais2);
        americaSul.adicionarPais(pais3);
        americaSul.adicionarPais(pais4);

        americaSul.exibirPaises();

        System.out.println(americaSul.populacaoTotalContinente());
        System.out.println(americaSul.dimensaoTotalContinente());
        System.out.println(americaSul.densidadePopulalcionalContinente());
        System.out.println(americaSul.paisMaiorPopulacaoContinente());
        System.out.println(americaSul.paisMenorPopulacaoContinente());
        System.out.println(americaSul.paisMaiorDimensaoTerritorial());
        System.out.println(americaSul.paisMenorDimensaoTerritorial());
        System.out.println(americaSul.razaoTerritorialEntreMenorMaior());

    }

}
