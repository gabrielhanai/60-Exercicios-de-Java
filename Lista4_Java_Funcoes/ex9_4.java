/*
 * EXERCÍCIO 9 - Soma de Intervalo
 * 
 * Desenvolva uma função que receba dois números inteiros (início e fim) 
 * e retorne a soma de todos os números entre eles.
 */

public class ex9_4 {
    public static int somaentre(int n1, int n2){
        int soma = 0;
        for(int i = n1 + 1; i < n2; i++){
            soma += i;
        }
        return soma;
    }
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        System.out.println(somaentre(5, 10));
    }
}
