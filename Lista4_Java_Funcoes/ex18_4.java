/*
 * EXERCÍCIO 18 - Inversão de String
 * 
 * Crie uma função que receba uma string 
 * e a exiba de trás para frente.
 */

public class ex18_4 {
    public static String inversao(String str){
        String inversa = "";
        for (int i = str.length() - 1; i >= 0; i--){
            inversa += str.charAt(i);
        }
        return inversa;
    }
    public static void main(String[] args) {
        String texto = "Olá, mundo!";
        System.out.println(inversao(texto));
    }
}
