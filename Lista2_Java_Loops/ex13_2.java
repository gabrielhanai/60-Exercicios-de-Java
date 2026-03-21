//Faça um algoritmo que imprima os números ímpares de 1 a 19.
import java.util.Scanner;
public class ex13_2{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Os números ímpares de 1 a 19 são: ");
        for (int i = 1; i <= 19; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}