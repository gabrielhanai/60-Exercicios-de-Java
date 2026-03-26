/*
 * EXERCÍCIO 15 - Soma de Vetor
 * 
 * Crie uma função que receba um vetor de inteiros e seu tamanho, 
 * e retorne a soma de todos os elementos.
 */

public class ex15_4 {
    public static int somaVetor(int[] vetor, int tamanho) {
        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }
        return soma;
    }
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int tamanho = vetor.length;
        System.out.println(somaVetor(vetor, tamanho));
    }
}
