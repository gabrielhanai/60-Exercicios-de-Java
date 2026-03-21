// Receba um número inteiro positivo. Se for par, divida-o por 2; se for ímpar, multiplique por 3 
// e some 1. Repita o processo até que o número se torne 1, imprimindo todos os valores da sequência.

import java.util.Scanner;

public class ex29_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int n = sc.nextInt();
        if (n <= 0){
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            System.out.print("Sequência: " + n);
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                System.out.print(" -> " + n);
            }
            System.out.println();
        }

        sc.close();
    }
}
