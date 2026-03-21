//Faça um algoritmo que imprima os números de 1 a 10 em ordem crescente.
import java.util.Scanner;
public class ex11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Os números de 1 a 10 em ordem crescente são:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}