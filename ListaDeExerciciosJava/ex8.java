// ================================
// Exercício 8 - Faça um algoritmo que leia o número de dias trabalhados por um funcionário e o valor da
// sua diária e calcule o seu salário
// ================================
import java.util.Scanner;
public class ex8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos dias você trabalhou?: ");
        int d = scanner.nextInt();
        System.out.print("Qual é o valor da sua diária?");
        int diaria = scanner.nextInt();
        int salario = (d * diaria);
        System.out.printf("Então o seu salário é: %d", salario);
    }
}