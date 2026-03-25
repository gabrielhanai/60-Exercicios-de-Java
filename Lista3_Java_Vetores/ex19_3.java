/*
 * EXERCÍCIO 19
 * Crie um vetor de floats com 8 elementos. Calcule a média aritmética de todos os valores. 
 * Em seguida, percorra o vetor novamente e imprima apenas os valores que estão acima 
 * da média calculada.
 */

public class ex19_3 {
    public static void main(String[] args) {
        float[] vetor = new float[8];
        float soma = 0;
        for (int i = 0; i < 8; i++){
            vetor[i] = i + 1.5f;
            soma += vetor[i];
        }
        float media = soma / vetor.length;
        System.out.println("Média aritmética: " + media);
        System.out.println("Valores acima da média: ");
        for (int i = 0; i < 8; i++){
            if (vetor[i] > media){
                System.out.println(vetor[i]);
            }
        }
    }
}
