// Faça um algoritmo que imprima os números pares de 0 a 20.
import java.util.Scanner;
public class ex12_2 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Os números pares de 0 a 20 são: ");
        for (int i = 0; i <= 20; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}