/*
 * EXERCÍCIO 7 - Maior de Dois
 * 
 * Escreva uma função que receba dois números 
 * e retorne o maior deles.
 */
import java.util.Scanner;
public class ex7_4 {
    public static int maior(int n1, int n2){
        if (n1 > n2){
            return n1;
        }
        else{
            return n2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        int resultado = maior(n1, n2);
        System.out.println("O maior número é: " + resultado);
        
        sc.close();
    }
}
