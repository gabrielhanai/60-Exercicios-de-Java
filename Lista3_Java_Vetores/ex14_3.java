/*
 * EXERCÍCIO 14
 * Crie um vetor de inteiros com 10 elementos. Calcule e imprima a soma dos elementos 
 * nas posições pares do vetor.
 */

public class ex14_3 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int soma = 0;
        for (int i = 0; i < 10; i++){
            vetor[i] = i + 1;
            if (i % 2 == 0){
                soma += vetor[i];
            }
        }
        System.out.println("Soma dos elementos nas posições pares: " + soma);
    }
}
