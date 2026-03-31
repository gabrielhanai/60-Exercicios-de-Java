// EXERCÍCIO 11 - Maior e Menor: Escreva um algoritmo que percorra um vetor de 10 posições e 
// identifique o valor máximo e o valor mínimo nele contidos.

public class ex11_5 {
    public static void main(String[] args) {
        int[] vetor = new int[]{2, 1, 3, 4, 5, 6, 7, 10, 9, 8};
        
        int max = vetor[0];
        int min = vetor[0];

        for(int numero : vetor) {
            if(numero > max) {
                max = numero;
            }
            if(numero < min) {
                min = numero;
            }
        }
        
        System.out.println("Maior valor: " + max);
        System.out.println("Menor valor: " + min);
    }
}
