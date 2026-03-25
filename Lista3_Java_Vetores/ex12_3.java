/*
 * EXERCÍCIO 12
 * Crie um vetor de floats com 10 elementos. Crie um novo vetor que contenha apenas 
 * os elementos do vetor que são maiores que 5. Imprima o novo vetor.
 */

public class ex12_3 {
    public static void main(String[] args) {
        float[] vetor = new float[10];
        float[] vetor2 = new float[10];
        for (int i = 0; i < 10; i ++){
            vetor[i] = i + 2.5f;
            if (vetor[i] > 5){
                vetor2[i] = vetor[i];
            }
            System.out.println(vetor[i]);
        }
        System.out.println("-----Segundo vetor abaixo com numeros acima de 5-----");
        for (int i = 0; i < 10; i ++){
            if (vetor2[i] > 5){
                System.out.println(vetor2[i]);
            }
        }

    }
}
