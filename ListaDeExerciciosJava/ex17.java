// Exercício 17 - Faça um algoritmo que leia o salário de um funcionário e calcule o seu novo salário com
// um aumento de 10% se o salário for menor que R$ 1000,00; ou de 5% se o salário for maior ou igual a R$ 1000,00.
import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        double novoSalario;

        if (salario < 1000) {
            novoSalario = salario * 1.10;
        } else {
            novoSalario = salario * 1.05;
        }

        System.out.printf("O novo salário do funcionário é: R$ %.2f%n", novoSalario);
        scanner.close();
    }
}
