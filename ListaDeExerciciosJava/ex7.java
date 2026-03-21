// ================================
// Exercício 6 - Faça um algoritmo que leia um número inteiro e mostre o seu sucessor e antecessor.
// ================================
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("De um número: ");
        int n1 = scanner.nextInt();
        int sn1 = n1 + 1;
        int an1 = n1 - 1;
        System.out.printf("Sucessor: %d e Antecessor: %d", sn1, an1);
    }
}
