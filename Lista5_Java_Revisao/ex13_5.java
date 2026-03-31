// EXERCÍCIO 13 - Vetor de Primos: Escreva um programa que leia um número inteiro positivo n e gere um 
// vetor contendo os n primeiros números primos.

public class ex13_5 {
    public static void main(String[] args) {
            int n = 10;
            int[] primos = new int[n];
            int count = 0;
            int num = 2; 
    
            while (count < n) {
                if (isPrimo(num)) {
                    primos[count] = num;
                    count++;
                }
                num++;
            }
    
            System.out.println("Os " + n + " primeiros números primos são:");
            for (int primo : primos) {
                System.out.print(primo + " ");
            }
        }
    
        public static boolean isPrimo(int num) {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
}
}