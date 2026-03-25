/*
 * EXERCÍCIO 3
 * Crie um vetor de floats com 4 elementos e calcule o produto dos valores armazenados no vetor.
 */

public class ex3_3 {
    public static void main(String[] args) {
        float[] vetor = new float[4];
        float produto = 1;
        for (int i = 0; i < 4 ; i++){
            vetor[i] = i + 1.25f;
        }

         for (int i = 0; i < 4 ; i++){
            produto = produto * vetor[i];
         }
         System.out.println("O produto dos valores armazenados no vetor é: " + produto);
    }
}
