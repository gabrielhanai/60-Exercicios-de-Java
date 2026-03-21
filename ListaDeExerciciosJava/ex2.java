// ================================
// Exercício 2 - Faça um algoritmo que leia um número inteiro e mostre o seu dobro, triplo e quadruplo.
// ================================
import java.util.Scanner;
public class ex2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        System.out.printf("Dobro: %d, Triplo: %d, Quadruplo: %d%n", n * 2, n * 3, n * 4);
    }
}

