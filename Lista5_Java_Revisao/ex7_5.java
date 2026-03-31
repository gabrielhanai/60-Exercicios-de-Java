// EXERCÍCIO 7 - Busca de Valor: Crie um vetor de 10 elementos. Solicite um número ao usuário e informe se esse valor está presente ou não no array.
import java.util.Scanner;
public class ex7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Digite um número para buscar no vetor: ");
        int numero = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("O valor " + numero + " está presente no vetor.");
        } else {
            System.out.println("O valor " + numero + " não está presente no vetor.");
        }
        scanner.close();

    }
}