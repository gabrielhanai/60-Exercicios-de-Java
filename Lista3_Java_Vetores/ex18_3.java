/*
 * EXERCÍCIO 18
 * Crie um vetor de inteiros com 10 elementos e solicite ao usuário que o preencha. 
 * Em seguida, desenvolva um algoritmo que inverta a ordem dos elementos dentro do próprio 
 * vetor (o primeiro passa a ser o último, o segundo o penúltimo, e assim por diante). 
 * Imprima o vetor após a inversão.
 */

public class ex18_3 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++){
            vetor[i] = i + 1;
        }
        System.out.println("Vetor original: ");
        for (int i = 0; i < 10; i++){
            System.out.println(vetor[i]);
        }
        // Invertendo a ordem dos elementos
        for (int i = 0; i < vetor.length / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = temp;
        }
        System.out.println("\nVetor invertido: ");
        for (int i = 0; i < 10; i++){
            System.out.println(vetor[i]);
        }
    }
}
