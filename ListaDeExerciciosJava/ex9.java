// ================================
// Exercício 9 - Faça um algoritmo que leia o preço de um produto e mostre o seu valor com desconto de
// 10%.
// ================================
import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o preço do produto?: ");
        float p = scanner.nextFloat();
        float p2 = p * 0.9f;
        System.out.printf("O novo preço com 10%% de desconto é: %.2f", p2);
        scanner.close();
    }
}
