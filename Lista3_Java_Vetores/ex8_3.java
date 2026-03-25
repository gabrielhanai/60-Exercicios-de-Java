/*
 * EXERCÍCIO 8
 * Crie um vetor de inteiros com tamanho 10 e imprima o valor mínimo e o valor máximo 
 * armazenados no Slice.
 */
import java.util.Scanner;
public class ex8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++){
            vetor[i] = i + 10;
        }
        
        int max = vetor[0];
        int min = vetor[0];
        for (int i = 0; i < 10; i++){
            if (vetor[i] > max){
                max = vetor[i];
            }
            if (vetor[i] < min){
                min = vetor[i];
            }
        }
        
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        sc.close();
    }
}
