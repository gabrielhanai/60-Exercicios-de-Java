// Faça um algoritmo que leia o nome, a idade (entre 0 e 150) e o salário (maior que zero) de uma pessoa. 
// O algoritmo deve continuar pedindo os dados enquanto as condições de validação não forem atendidas.

import java.util.Scanner;

public class ex24_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.next();
        System.out.println("Digite a idade da pessoa (entre 0 e 150): ");
        int idade = sc.nextInt();
        System.out.println("Digite o salário da pessoa (maior que zero): ");
        int salario = sc.nextInt();
        while (idade < 0 || idade > 150 || salario <= 0) {
            System.out.println("Valores invalidos, idade dever ser 0 ~ 150 e salário > 0");
            System.out.println("Digite o nome da pessoa: ");
            nome = sc.next();
            System.out.println("Digite a idade da pessoa (entre 0 e 150): ");
            idade = sc.nextInt();
            System.out.println("Digite o salário da pessoa (maior que zero): ");
            salario = sc.nextInt();
        }
        sc.close();
    }  
}
