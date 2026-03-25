/*
 * EXERCÍCIO 11
 * Crie um vetor de inteiros com tamanho 8 e solicite ao usuário que informe dois índices 
 * de elementos que deverão ser trocados de posição. Imprima o vetor resultante.
 */
import java.util.Scanner;
public class ex11_3 {
    public static void main(String[] args) {
        int[] vetor = new int[8];
        for (int i = 0; i < 8; i++){
            vetor[i] = i + 1;
        }
        System.out.println("Informe um índice do elemento que deseja trocar de posição: ");
        Scanner sc = new Scanner(System.in);
        int index1 = sc.nextInt();
        System.out.println("Informe outro índice do elemento que deseja trocar de posição: ");
        int index2 = sc.nextInt();
        int temp = vetor[index1];
        vetor[index1] = vetor[index2];
        vetor[index2] = temp;
        System.out.println("\nVetor resultante: ");
        for (int i = 0; i < 8; i++){
            System.out.println(vetor[i]);
        }
        sc.close();
    }
}
