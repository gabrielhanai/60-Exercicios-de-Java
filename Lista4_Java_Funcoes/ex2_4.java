/*
 * EXERCÍCIO 2 - Conversor de Temperatura
 * 
 * Escreva uma função que receba uma temperatura em Celsius 
 * e retorne o valor convertido para Fahrenheit.
 */

public class ex2_4 {
    public static float temp(float c){
        float f = (c * (9.0f/5.0f)) + 32;
        return f;
    }
    public static void main(String[] args) {
        System.out.println(temp(50));
    }
}
