// Exercício 11 - Faça um algoritmo que leia dois números inteiros e mostre o maior deles.
import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = scanner.nextInt();
        if (n1 > n2) {
            System.out.printf("O maior número é: %d", n1);
        }
        else if (n2 > n1) {
            System.out.printf("O maior número é: %d", n2);
        }
        else{
            System.out.println("Os números são iguais.");
        }
        scanner.close();
    }
}
