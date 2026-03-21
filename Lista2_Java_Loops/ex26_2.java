// Faça um algoritmo que calcule o valor de A elevado a B (A^B), onde A e B são fornecidos pelo usuário, 
// sem utilizar funções prontas de exponenciação (use repetição).
import java.util.Scanner;
public class ex26_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base (A): ");
        int A = sc.nextInt();
        System.out.println("Digite o expoente (B): ");
        int B = sc.nextInt();
        int resultado = 1;
        for (int i = 0; i < B; i++) {
            resultado *= A;
        }
        System.out.println("O resultado de " + A + " elevado a " + B + " é: " + resultado);

        sc.close();
    }
    
}
