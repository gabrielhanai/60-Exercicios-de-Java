/*
 * EXERCÍCIO 1
 * Crie um vetor de inteiros com 3 elementos e imprima a soma dos valores armazenados no vetor.
 */

public class ex1_3 {
    public static void main(String[] args) {

        int soma = 0;
        int[] vetor = new int[3];
        for(int i = 0; i < 3; i++){
            vetor[i] = i + 1;
            soma += vetor[i];
        }
        System.out.println("A soma entre os 3 elementos do vetor é " + vetor[0] + " + " + vetor[1] + " + " + vetor[2] + " = " + soma);
    }
}
