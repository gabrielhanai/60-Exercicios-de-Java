/*
 * EXERCÍCIO 5
 * Crie um vetor de inteiros com 10 elementos. Em seguida, solicite ao usuário que 
 * informe um valor e verifique se esse valor está presente no Array. 
 * Imprima o resultado da busca.
 */
import java.util.Scanner;

public class ex5_3 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        
        for (int i = 0; i < 10; i++) {
            vetor[i] = i + 3;
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para buscar: ");
        int n = sc.nextInt();
        
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == n) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("O número " + n + " está presente no vetor.");
        } else {
            System.out.println("O número " + n + " não está presente no vetor.");
        }
        
        sc.close();
    }
}
