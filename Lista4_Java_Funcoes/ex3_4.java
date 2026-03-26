/*
 * EXERCÍCIO 3 - Verificador de Paridade
 * 
 * Crie uma função que receba um número inteiro e retorne 
 * true se for par e false se for ímpar.
 */

public class ex3_4 {
    public static boolean pi(int n){
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println(pi(4));
        System.out.println(pi(7));
    }
}
