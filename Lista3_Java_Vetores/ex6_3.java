/*
 * EXERCÍCIO 6
 * Crie um vetor de inteiros com o tamanho N. Em seguida, solicite ao usuário que 
 * informe um número inteiro. Adicione esse número ao vetor apenas se ele não estiver presente. 
 * Imprima o vetor resultante.
 */
import java.util.Scanner;

public class ex6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int n1 = sc.nextInt();
        int[] vetor = new int[n1 + 1]; // Criar com espaço extra para adicionar elemento
        

        for(int i = 0; i < n1; i++) {
            vetor[i] = i + 1;
        }
        

        System.out.println("Digite um número para adicionar: ");
        int numero = sc.nextInt();
        

        boolean existe = false;
        for(int i = 0; i < n1; i++) {
            if(vetor[i] == numero) {
                existe = true;
                break;
            }
        }
        

        if(!existe) {
            vetor[n1] = numero;
            n1++;
            System.out.println("Número adicionado com sucesso!");
        } else {
            System.out.println("O número já está presente no vetor!");
        }
        
        System.out.println("\nVetor resultante: ");
        for(int i = 0; i < n1; i++) {
            System.out.println(vetor[i]);
        }
        
        sc.close();
    }
}
