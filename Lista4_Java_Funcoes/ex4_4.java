/*
 * EXERCÍCIO 4 - Média Simples
 * 
 * Desenvolva uma função que receba três notas (floats) 
 * e retorne a média aritmética simples.
 */

public class ex4_4 {
    public static float media(float n1, float n2, float n3){
        float media = (n1 + n2 + n3) / 3;
        return media;
    }
    public static void main(String[] args) {
        System.out.println(media(8.5f, 9.0f, 7.5f));
    }
}
