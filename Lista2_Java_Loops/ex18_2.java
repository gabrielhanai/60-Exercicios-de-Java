// Faça um algoritmo que leia um número inteiro positivo e mostre todos os seus divisores.
import java.util.Scanner;
public class ex18_2 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}