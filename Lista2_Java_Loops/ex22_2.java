// Faça um algoritmo que imprima os primeiros $n$ termos da sequência de Fibonacci, 
// onde $n$ é fornecido pelo usuário. (Ex: 0, 1, 1, 2, 3, 5, 8, 13...)
import java.util.Scanner;
public class ex22_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de termos da sequência de Fibonacci: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        if (n <= 0) {
            System.out.println("Por favor, insira um número maior que 0.");
        } else {
            System.out.print("Sequência de Fibonacci: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int temp = a + b;
                a = b;
                b = temp;
            }
        }
        sc.close();
    }
}
