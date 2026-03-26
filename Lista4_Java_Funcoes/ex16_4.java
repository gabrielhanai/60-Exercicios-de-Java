/*
 * EXERCÍCIO 16 - Busca em Vetor
 * 
 * Desenvolva uma função que receba um vetor de 10 posições e um valor X. 
 * A função deve retornar a posição (índice) onde X se encontra ou -1 caso não exista.
 */

public class ex16_4 {
    public static int buscaVetor(int[] vetor, int x) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int x = 50;
        System.out.println(buscaVetor(vetor, x)); // Saída: 4
    }
}
