// Exercício 16 - Faça um algoritmo que leia dois números inteiros e mostre o resultado da multiplicação
// entre eles, se ambos forem positivos; ou a soma, se pelo menos um deles for negativo.
import java.util.Scanner;
public class ex16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = scanner.nextInt();
        int mult = n1 * n2;
        int soma = n1 + n2;
        if (n1 >= 0 && n2 >= 0){
            System.out.printf("A multiplicação entre eles é igual a %d x %d = %d", n1, n2, mult);
        }
        else if (n1 < 0 || n2 < 0){
            System.out.printf("A soma entre eles é igual a %d + %d = %d", n1, n2, soma);
            scanner.close();
        }
    }
}
