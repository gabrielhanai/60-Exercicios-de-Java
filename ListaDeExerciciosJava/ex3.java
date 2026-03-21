// ================================
// Exercício 3 - Faça um algoritmo que leia o peso e a altura de uma pessoa e calcule o seu IMC
// ================================
import java.util.Scanner;
public class ex3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);
        System.out.print("Qual é a sua altura?: ");
        float alt = scanner.nextFloat();
        System.out.print("Qual é o seu peso?: ");
        float peso = scanner.nextFloat();
        float imc = peso / (alt * alt);
        System.out.printf("O seu IMC é %.2f", imc);
        scanner.close();

    }
}

