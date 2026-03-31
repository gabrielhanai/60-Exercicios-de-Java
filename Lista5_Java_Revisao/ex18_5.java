// EXERCÍCIO 18 - Ordenação (Bubble Sort): Implemente uma função que receba um vetor e o ordene em 
// ordem crescente utilizando o algoritmo de troca (Bubble Sort).

public class ex18_5 {
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 1; i < n; i++) {
                if (vetor[i - 1] > vetor[i]) {
                    int temp = vetor[i - 1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = temp;
                    trocou = true;
                }
            }
            n--;
        } while (trocou);
    }
    public static void main(String[] args) {
        int[] vetor = new int[]{64, 34, 25, 12, 22, 11, 90};
        bubbleSort(vetor);
        System.out.println("Vetor ordenado:");
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
    }
}
