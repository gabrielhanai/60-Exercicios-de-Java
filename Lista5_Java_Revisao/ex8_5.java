// EXERCÍCIO 8 - Contador de Ocorrências: Leia um vetor de 10 inteiros. Peça um número X e 
// conte quantas vezes X aparece no vetor. Se não aparecer, informe ao usuário.
import java.util.Scanner;
public class ex8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[]{1, 5, 5, 5, 1, 2, 2, 3, 2, 7};

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        int cont = 0;

        for (int numero : vetor) {
            if (numero == n){
                cont++;
            }
        }
        System.out.println("O número " + n + " aparece " + cont + " vezes no vetor.");
        sc.close();
    }
}