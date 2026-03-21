// Exercício 19: Faça um algoritmo que leia três números reais e mostre-os em ordem crescente.
import java.util.Scanner;
public class ex19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();

        if (n1 <= n2 && n1 <= n3) {
            if (n2 <= n3) {
                System.out.printf("Os números em ordem crescente são: %.2f, %.2f, %.2f", n1, n2, n3);
            } else {
                System.out.printf("Os números em ordem crescente são: %.2f, %.2f, %.2f", n1, n3, n2);
            }
        } else if (n2 <= n1 && n2 <= n3) {
            if (n1 <= n3) {
                System.out.printf("Os números em ordem crescente são: %.2f, %.2f, %.2f", n2, n1, n3);
            } else {
                System.out.printf("Os números em ordem crescente são: %.2f, %.2f, %.2f", n2, n3, n1);
            }
        } else {
            if (n1 <= n2) {
                System.out.printf("Os números em ordem crescente são: %.2f, %.2f, %.2f", n3, n1, n2);
            } else {
                System.out.printf("Os números em ordem crescente são: %.2f, %.2f, %.2f", n3, n2, n1);
            }
        }
        scanner.close();

    }
}
