//Faça um algoritmo que imprima os números de 1 a 100, substituindo os múltiplos 
// de 3 pela palavra "Fizz" e os múltiplos de 5 pela palavra "Buzz". 
// Para os números que são múltiplos de ambos, utilize a palavra "FizzBuzz".
public class ex17_2 {
public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}