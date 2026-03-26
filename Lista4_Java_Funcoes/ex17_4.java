/*
 * EXERCÍCIO 17 - Média de Vetor com Filtro
 * 
 * Escreva uma função que receba um vetor de floats, calcule a média 
 * e imprima apenas os valores que estão acima dessa média.
 */

public class ex17_4 {
    public static void mediaAcima(float[] vetor) {
        float soma = 0;
        for (float num : vetor) {
            soma += num;
        }
        float media = soma / vetor.length;
        System.out.println("Média: " + media);
        System.out.println("Valores acima da média:");
        for (float num : vetor) {
            if (num > media) {
                System.out.println(num);
            }
        }
    }
    public static void main(String[] args) {
        float[] vetor = {1.5f, 2.0f, 3.5f, 4.0f, 5.5f};
        mediaAcima(vetor);
    }
}
