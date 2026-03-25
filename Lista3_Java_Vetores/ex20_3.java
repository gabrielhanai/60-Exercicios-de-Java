/*
 * EXERCÍCIO 20
 * Crie um vetor de inteiros com 10 elementos. Solicite ao usuário que informe um número 
 * e o programa deve contar e imprimir quantas vezes esse número aparece dentro do vetor. 
 * Se o número não aparecer nenhuma vez, informe ao usuário.
 */

import java.util.Scanner;

public class ex20_3 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++){
            vetor[i] = i + 1;
        }
        System.out.println("Informe um número para contar quantas vezes ele aparece no vetor: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < 10; i++){
            if (vetor[i] == n){
                count++;
            }
        }
        if (count > 0){
            System.out.println("O número " + n + " aparece " + count + " vezes no vetor.");
        } else {
            System.out.println("O número " + n + " não aparece nenhuma vez no vetor.");
        }
        sc.close();
    }
}
