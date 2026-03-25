/*
 * EXERCÍCIO 10
 * Crie um vetor de inteiros com N elementos. Solicite ao usuário que informe um número 
 * que será adicionado ao primeiro e ao último elemento do vetor. Imprima o vetor resultante.
 */
import java.util.Scanner;
public class ex10_3 {
    public static void main(String[] args) {
        
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++){
            vetor[i] = i + 1;
        }
        System.out.println("Qual o nuemro será adicionado ao primeiro elemento do vetor? ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        vetor[0] += n1;
        System.out.println("Qual o nuemro será adicionado ao último elemento do vetor? ");
        int n2 = sc.nextInt();
        vetor[9] += n2;
        System.out.println("\nVetor resultante: ");
        for (int i = 0; i < 10; i++){
            System.out.println(vetor[i]);
        }
        sc.close();

    }
}
