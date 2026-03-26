/*
 * EXERCÍCIO 10 - Contador de Vogais
 * 
 * Escreva uma função que receba uma string e, utilizando um laço de repetição, 
 * conte quantas vogais existem nela.
 */

public class ex10_4 {
    public static int contvogais(String frase){
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || 
                letra == 'o' || letra == 'u') {
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {
        String teste = "Olá Mundo";
        System.out.println("Vogais em \"" + teste + "\": " + contvogais(teste));
        
        String teste2 = "programação";
        System.out.println("Vogais em \"" + teste2 + "\": " + contvogais(teste2));
    }
}
