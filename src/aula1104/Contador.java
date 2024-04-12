/*1) Escreva em Java uma classe Contador, que encapsule um valor usado para contagem de
itens ou eventos. A classe deve oferecer métodos que devem:
a) Zerar;
b) Incrementar;
c) Retornar o valor do contador.*/

package aula1104;
public class Contador {

    private int contador;

    public Contador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void zerar(){
        this.contador = 0;
    }

    public void incrementar(){
        this.contador = contador+1;
    }

    public void retornarValor(){
        System.out.println("O valor do contador é "+getContador());
    }

}
