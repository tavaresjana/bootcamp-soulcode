package aula1903;

import java.util.Scanner;

public class MetodoVerificaParImpar {
    public static int metodoretorno(){
        return 10;
    }
    public static String verificaParImpar(int numero){
        if(numero%2 == 0){
            return "O numero é par";
        }else{
            return "O numero é impar";
        }
    }

    public static void main(String[] args) {
        System.out.println(verificaParImpar(metodoretorno()));
    }
}

