// Faça um algoritmo que imprima a tabuada de multiplicação 
// de 1 a 10 para um número fornecido pelo usuário.
import java.util.Scanner;
public class ex16_2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    System.out.println("Digite um número");
    int n = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
        System.out.println(n + " x " + i + " = " + (n * i));
    }
    sc.close();
    }
}