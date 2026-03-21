// Faça um algoritmo que leia um valor de saque (inteiro) e informe quantas notas de cada valor serão entregues. Considere notas de 50, 20, 10, 5 e 1 real.
// O algoritmo deve priorizar as notas de maior valor.

import java.util.Scanner;

public class ex30_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque (inteiro): ");
        int valor = sc.nextInt();
        int notas50 = valor / 50;
        valor %= 50;
        int notas20 = valor / 20;
        valor %= 20;
        int notas10 = valor / 10;
        valor %= 10;
        int notas5 = valor / 5;
        valor %= 5;
        int notas1 = valor;
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);
        System.out.println("Notas de 1: " + notas1);
        sc.close();
    }
}

