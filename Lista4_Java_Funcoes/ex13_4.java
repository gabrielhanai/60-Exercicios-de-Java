/*
 * EXERCÍCIO 13 - Fatorial
 * 
 * Crie uma função que calcule o fatorial de um número inteiro 
 * passado por parâmetro usando um laço while.
 */

public class ex13_4 {
    public static int fat(int n){
        int fatorial = 1;
        while (n > 1){
            fatorial *= n;
            n--;
        }
        return fatorial;
    }
    public static void main(String[] args) {
        System.out.println(fat(5));
    }
}
