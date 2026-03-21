// Exercício 18 - Faça um algoritmo que leia um número inteiro entre 1 e 7 e mostre o dia da semana
// correspondente (1 = domingo, 2 = segunda-feira, etc.)
import java.util.Scanner;
public class ex18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digte um número inteiro entre 1 e 7: ");
        int n = scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido. Por favor, digite um número entre 1 e 7.");
                break;
        }
    }
}
