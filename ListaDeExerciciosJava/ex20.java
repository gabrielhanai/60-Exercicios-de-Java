// Exercício 20 - Faça um algoritmo que leia a idade de uma pessoa e mostre a sua classificação, de
//acordo com a seguinte tabela:
//* até 9 anos: mirim
//* 10 a 13 anos: infantil
//* 14 a 17 anos: juvenil
//* maiores de 18 anos: adulto
import java.util.Scanner;
public class ex20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é a sua idade?: ");
        int i = scanner.nextInt();
        if (i <= 9){
            System.out.println("Mirim");
        }
        else if (i >= 10 && i <= 13){
            System.out.println("Infantil");
        }
        else if (i >= 14 && i <= 17){
            System.out.println("Juvenil");
        }
        else{
            System.out.println("Adulto");
        }
        scanner.close();
    }
}
