/*
 * EXERCÍCIO 13
 * Crie um vetor de inteiros com 10 elementos. Crie um novo vetor que contenha apenas 
 * os elementos pares do vetor original. Imprima o novo vetor.
 */

public class ex13_3 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int[] vetor2 = new int[10];
        for (int i = 0; i < 10; i ++){
            vetor[i] = i + 1;
            if (vetor[i] % 2 == 0){
                vetor2[i] = vetor[i];
            }
            System.out.println(vetor2[i]); // desse jeito nao da certo pois imprime valores 0,
            // por conta de na primeira vez de checar o if sera o numero 1 que é impar entao o if
            // nao sera satisfeito e o valor 0 do vetor2 sera impresso, e isso se repetira para 
            // os numeros impares, entao a solucao é:
        }
        System.out.println("-----Segundo vetor abaixo com numeros pares-----");
        for (int i = 0; i < 10; i ++){
            if (vetor2[i] != 0){
                System.out.println(vetor2[i]);
            }
        }
    }
}
