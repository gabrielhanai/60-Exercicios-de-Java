/*
 * EXERCÍCIO 1 - Dobro do Valor
 * 
 * Crie uma função que receba um número inteiro como parâmetro 
 * e retorne o seu dobro.
 */

public class ex1_4 {
    
    public static int dobro(int n) {
        return n * 2;
    }
    
    public static void main(String[] args) {
        int n = 5;
        int resultado = dobro(n);
        System.out.println("O dobro de " + n + " é: " + resultado);
    }
}
