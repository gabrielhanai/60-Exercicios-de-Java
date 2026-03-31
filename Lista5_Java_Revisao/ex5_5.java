// EXERCÍCIO 5 - Soma de Posições Pares: Crie um vetor de 10 inteiros e calcule a soma apenas dos elementos que estão armazenados nas posições (índices) pares.

public class ex5_5 {
    public static void main(String[] args) {
        int soma = 0;
        int[] vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for(int i = 0; i < vetor.length; i++) {
            if(i % 2 == 0) {
                soma += vetor[i];
            }
        }
        
        System.out.println(soma);
    }
}