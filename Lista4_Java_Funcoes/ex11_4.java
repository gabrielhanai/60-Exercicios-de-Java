/*
 * EXERCÍCIO 11 - Calculadora Básica
 * 
 * Crie uma função que receba dois números e um caractere representando a operação 
 * (+, -, *, /). Utilize switch case para realizar o cálculo e retornar o resultado.
 */

public class ex11_4 {
    public static int calculadora(int num1, int num2, char operacao) {
        int resultado = 0;
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return 0; // Retorna 0 ou pode lançar uma exceção
                }
                break;
            default:
                System.out.println("Operação inválida!");
                return 0; // Retorna 0 ou pode lançar uma exceção
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(calculadora(10, 5, '+')); // Saída: 15
        System.out.println(calculadora(10, 5, '-')); // Saída: 5
        System.out.println(calculadora(10, 5, '*')); // Saída: 50
        System.out.println(calculadora(10, 5, '/')); // Saída: 2
    }
}
