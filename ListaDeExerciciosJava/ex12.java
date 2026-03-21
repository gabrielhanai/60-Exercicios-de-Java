// Exercício 12 - Faça um algoritmo que leia três números inteiros e mostre o menor deles.
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três números inteiros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.printf("O menor número é %d", n1);
        }
        else if (n2 < n1 && n2 < n3) {
            System.out.printf("O menor número é %d", n2);
        }
        else if (n3 < n1 && n3 < n2) {
            System.out.printf("O menor número é %d", n3);
        }
        else {
            System.out.println("Os números são iguais.");
        }
        scanner.close();
    }
    
}
