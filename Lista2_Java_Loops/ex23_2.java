// Fatorial: Faça um algoritmo que calcule o fatorial de um número inteiro fornecido pelo usuário (n!)
import java.util.Scanner;
public class ex23_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro para calcular o fatorial: ");
        int n = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial);
        sc.close();
    }
}
