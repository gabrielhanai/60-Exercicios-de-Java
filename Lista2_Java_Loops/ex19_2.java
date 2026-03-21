// Faça um algoritmo que leia vários números inteiros e 
// mostre a média aritmética entre eles. A leitura deve ser
// interrompida quando for lido o valor zero.
import java.util.Scanner;
public class ex19_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int total = 0;
        float media = 0;
        int n;
        do {
            System.out.println("Digite um número: ");
            n = sc.nextInt();

            if (n != 0) {
                soma += n;
                total += 1;
            }

        } while (n != 0);

        if (total > 0) {
            media = (float) soma / total;
            System.out.println(media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
        sc.close();
    }
}