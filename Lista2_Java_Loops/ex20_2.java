// Faça um algoritmo que leia vários números inteiros e mostre o maior deles. 
// A leitura deve ser interrompida quando for lido o valor zero.
import java.util.Scanner;
public class ex20_2 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int n;

        do {
            System.out.println("Digite um número (0 para encerrar): ");
            n = sc.nextInt();

            if (n != 0 && n > maior) { 
                maior = n;
            }
        } while (n != 0);

        if (maior != Integer.MIN_VALUE) {
            System.out.println("O maior número digitado foi: " + maior);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        sc.close();
    }
}