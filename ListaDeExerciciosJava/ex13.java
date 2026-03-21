import java.util.Scanner;

// Exercício 13 - Faça um algoritmo que leia um número inteiro e mostre se ele é par ou ímpar.
public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.printf("O número %d é par.", n);
        }
        else {
            System.out.printf("O número %d é ímpar.", n);
        }
        scanner.close();
    }
}
