// Faça um algoritmo que leia um número inteiro positivo e determine se ele é um número 
// primo (divisível apenas por 1 e por ele mesmo).
import java.util.Scanner;
public class ex21_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        boolean primo = true;

if (n < 2) {
    primo = false;
} else {
    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            primo = false;
            break;
        }
    }
}

if (primo) {
    System.out.println(n + " é primo!");
} else {
    System.out.println(n + " não é primo!");
}
sc.close();
    }
}
