/*
 * EXERCÍCIO 16
 * Faça um programa que leia dois vetor de inteiros de tamanho n e gere um terceiro 
 * vetor que seja a soma dos dois primeiros.
 */
import java.util.Scanner;
public class ex16_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho dos vetores: ");
        int n = sc.nextInt();
        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];
        int[] somaVetores = new int[n];

        for (int i = 0; i < n; i++){
            vetor1[i] = i + 1;
            vetor2[i] = i + 1;
            somaVetores[i] = vetor1[i] + vetor2[i];
        }
        
        System.out.println("Soma dos vetores: ");
        for (int i = 0; i < n; i++){
            System.out.println(somaVetores[i]);
        }
        sc.close();

    }
}
