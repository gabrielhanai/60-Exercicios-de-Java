/*
 * EXERCÍCIO 15
 * Escreva um programa que leia um número inteiro positivo n e gere um vetor 
 * com os n primeiros números primos.
 */
import java.util.Scanner;
public class ex15_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int n = sc.nextInt();
        int[] primos = new int[n];
        int count = 0;
        int num = 2;
        while (count < n) {
            boolean isPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                primos[count] = num;
                count++;
            }
            num++;
        }
        System.out.println("Os " + n + " primeiros números primos são:");
        for (int i = 0; i < n; i++) {
            System.out.print(primos[i] + " ");
        }
        sc.close();
    }
}
