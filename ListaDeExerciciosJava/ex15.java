// Corrigido o código para ajustar o import, mensagens e formatação.
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.printf("O número %d é múltiplo de 3 e 5.%n", n);
        } else {
            System.out.printf("O número %d não é múltiplo de 3 e 5.%n", n);
        }

        scanner.close();
    }
}
