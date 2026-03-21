import java.util.Scanner;

// Faça um algoritmo que receba dois números inteiros e calcule a soma de 
// todos os números ímpares e múltiplos de 3 situados no intervalo entre eles.

public class ex27_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();

        int soma = 0;
        for (int i = n1; i <= n2; i++) {
            if (i % 2 != 0 && i % 3 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos números ímpares e múltiplos de 3 no intervalo é: " + soma);
        sc.close();
    }
}
