// EXERCÍCIO 6 - Preenchimento Dinâmico: Peça ao usuário para definir o tamanho N de um vetor, preencha-o com números inteiros e exiba o vetor completo ao final.
import java.util.Scanner;
public class ex6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int N = scanner.nextInt();
        int[] vetor = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Vetor completo:");
        for (int i = 0; i < N; i++) {
            System.out.print(vetor[i] + " ");
        }
        scanner.close();
    }
}