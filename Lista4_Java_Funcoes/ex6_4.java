/*
 * EXERCÍCIO 6 - Cálculo de Área
 * 
 * Crie uma função que calcule e retorne a área de um retângulo, 
 * recebendo a base e a altura como parâmetros.
 */

public class ex6_4 {
    public static float are(float base, float altura){
        float area = base * altura;
        return area;
    }
    public static void main(String[] args) {
        System.out.println(are(5.0f, 3.0f));
    }
}
