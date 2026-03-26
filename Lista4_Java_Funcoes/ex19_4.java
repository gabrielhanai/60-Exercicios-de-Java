/*
 * EXERCÍCIO 19 - Maior e Menor no Vetor
 * 
 * Faça uma função que receba um vetor de inteiros e, 
 * através de passagem de parâmetros ou exibição direta, 
 * mostre o maior e o menor valor presente.
 */

public class ex19_4 {
    public static void maiorMenor(int[] vetor) {
        int maior = vetor[0];
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 5, 6};
        maiorMenor(vetor);
        
    }
}
