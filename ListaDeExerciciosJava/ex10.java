// ================================
// Exercício 10 - Faça um algoritmo que leia o peso de uma pessoa em quilos e converta para libras.
// ================================
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu peso em kg: ");
        float pesoKg = scanner.nextFloat();
        float pesoLb = pesoKg * 2.20462f;
        System.out.printf("O seu peso em libras é: %.2f lb", pesoLb);
        scanner.close();
    }
    
}
