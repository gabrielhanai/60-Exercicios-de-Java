/*
 * EXERCÍCIO 7
 * Crie um Vetor de floats com 6 elementos. Solicite ao usuário que informe um número 
 * que será adicionado em todas as posições do vetor. Imprima o vetor resultante.
 */
import java.util.Scanner;
public class ex7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] vetor = new float[6];
        System.out.println("Digite um número para adicionar a todas as posições do vetor: ");
        float n = sc.nextFloat();
        for (int i = 0; i < 6 ; i++){
            vetor[i] = n;
        }

        for(int i = 0; i < 6; i++){
            System.out.println(vetor[i]);
        }
        sc.close();
    }
}
