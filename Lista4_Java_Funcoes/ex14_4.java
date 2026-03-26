/*
 * EXERCÍCIO 14 - Verificador de Primos
 * 
 * Escreva uma função que receba um número e retorne se ele é primo ou não 
 * (utilize a lógica de divisores).
 */

public class ex14_4 {
    public static boolean primo(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(primo(7));
        System.out.println(primo(10));
}
}
