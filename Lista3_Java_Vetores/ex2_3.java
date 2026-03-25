/*
 * EXERCÍCIO 2
 * Crie um vetor de inteiros com os valores 1, 2, 3, 4 e 5. Remova o terceiro elemento 
 * e coloque o número 0 no lugar e imprima o vetor resultante.
 */

public class ex2_3 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        for (int i = 0; i < 5; i++) {
            vetor[i] = i + 1;
        }
        vetor[2] = 0;
        System.out.println(("Vetor resultante: " + vetor[0] + ", " + vetor[1] + ", " + vetor[2] + ", " + vetor[3] + ", " + vetor[4]));
    }
}
