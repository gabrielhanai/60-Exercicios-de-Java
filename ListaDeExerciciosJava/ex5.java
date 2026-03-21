// Exercício 5 - Faça um algoritmo que leia a idade de uma pessoa em anos e mostre a idade em dias.
// ================================
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade em anos: ");
        int idade = scanner.nextInt();
        int idadeEmDias = idade * 365;
        System.out.printf("A sua idade em dias é equivalente a %d", idadeEmDias);

    }
}
