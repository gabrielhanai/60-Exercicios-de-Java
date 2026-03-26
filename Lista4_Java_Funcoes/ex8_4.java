/*
 * EXERCÍCIO 8 - Tabuada Dinâmica
 * 
 * Crie uma função que receba um número e imprima a sua tabuada 
 * do 1 ao 10 utilizando um laço for.
 */
public class ex8_4 {
    public static void tabuada(int n){
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
    public static void main(String[] args) {
        tabuada(5);
    }
}
