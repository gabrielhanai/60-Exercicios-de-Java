/*
 * EXERCÍCIO 9
 * Crie um vetor de inteiros com 5 elementos. Em seguida, crie um novo vetor que 
 * contenha apenas os elementos do vetor que são múltiplos de 3. Imprima o novo vetor.
 */

public class ex9_3 {
    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 6, 9};

        for (int i = 0; i < 5; i++) {
            if (vetor[i] % 3 == 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}
