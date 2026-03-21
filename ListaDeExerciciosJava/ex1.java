// ================================
// Exercício 1 - Soma de 3 números
// ================================

import java.util.Scanner;
public class ex1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número:");
        int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro número:");
        int n3 = scanner.nextInt();
        int soma = n1 + n2 + n3;
        System.out.printf("A soma entre esses três números inteiros é = %d%n", soma);
        scanner.close();
    }
    
}
