/*
 * EXERCÍCIO 17
 * Desenvolva um programa que leia um vetor (array) de inteiros com um tamanho pré-definido. 
 * O programa deve verificar se os elementos do vetor estão dispostos em ordem crescente. 
 * Caso o vetor não esteja ordenado, aplique um algoritmo de ordenação para organizá-lo. 
 * Ao final, exiba o vetor original (ou o estado de erro) e o vetor devidamente ordenado.
 */

public class ex17_3 {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 5, 6};
        for (int i = 0; i < 6; i++){
            if (vetor[i] > vetor[i + 1]){
                System.out.println("Vetor não está em ordem crescente");
                // algoritmo de ordenação (bubble sort)
                for (int j = 0; j < vetor.length - 1; j++){
                    for (int k = 0; k < vetor.length - j - 1; k++){
                        if (vetor[k] > vetor[k + 1]){
                            int temp = vetor[k];
                            vetor[k] = vetor[k + 1];
                            vetor[k + 1] = temp;
                        }
                    }
                }
                break;
            }
        }
    }
}
