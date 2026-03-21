// ================================
// Exercício 6 - Faça um algoritmo que leia o salário de um funcionário e calcule o seu novo salário com
// um aumento de 15%.
// ================================
import java.util.Scanner;
public class ex6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu salário?");
        int s = scanner.nextInt();
        float s2 = s * 1.15f;
        System.out.printf("O seu novo salário com um aumento de 15%% é %.2f", s2);
        scanner.close();
    }
}