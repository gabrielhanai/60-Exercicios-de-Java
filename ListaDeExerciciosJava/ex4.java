// ================================
// Exercício 4 - Faça um algoritmo que leia três números reais e mostre a média ponderada entre eles,
// com pesos 2, 3 e 5, respectivamente
// ================================
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);
        System.out.print("Digite o primeiro numero (peso 2): ");
        float n1 = scanner.nextFloat();
        System.out.print("Digite o segundo numero (peso 3): ");
        float n2 = scanner.nextFloat();
        System.out.print("Digite o terceiro numero (peso 5): ");
        float n3 = scanner.nextFloat();
        float media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
        System.out.printf("A média ponderada entre esses três números é = %.2f", media);
        scanner.close();

    }
}
