// Faça um algoritmo que leia um número inteiro decimal e mostre o seu equivalente 
// em binário utilizando estruturas de repetição.
import java.util.Scanner;
public class ex25_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro decimal: ");
        int n = sc.nextInt();
        StringBuilder binario = new StringBuilder();

        if (n == 0) {
            binario.append("0");
        } else {
            while (n > 0) {
                int resto = n % 2;
                binario.insert(0, resto);
                n /= 2;
            }
        }

        System.out.println("O equivalente em binário é: " + binario.toString());
        sc.close();
    }
}
