/*
 * EXERCÍCIO 4
 * Crie um programa que declare um Array de inteiros com um tamanho fixo (ex: 5 posições). 
 * Solicite ao usuário que preencha todas as posições desse vetor com valores inteiros. 
 * Em seguida, imprima o Array completo e a soma de todos os valores armazenados.
 */
import java.util.Scanner;
public class ex4_3 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número inteiro para a posição " + i + ": ");
            vetor[i] = sc.nextInt();

        }
        sc.close();
    }
}
