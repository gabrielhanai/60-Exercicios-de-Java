/*
 * EXERCÍCIO 20 - Ordenação Simples
 * 
 * Desenvolva uma função que receba um vetor e o ordene em ordem crescente 
 * (pode usar o algoritmo Bubble Sort que vimos brevemente).
 */

public class ex20_4 {
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca vetor[j] e vetor[j+1]
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] vetor = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Vetor antes da ordenação:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        bubbleSort(vetor);
        System.out.println("\nVetor depois da ordenação:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
