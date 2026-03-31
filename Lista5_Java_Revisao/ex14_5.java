// EXERCÍCIO 14 - Inversão de Ordem: Crie um vetor de 10 elementos e desenvolva um algoritmo que 
// inverta a ordem dos elementos dentro do próprio vetor (sem usar vetor auxiliar).

public class ex14_5 {
    public static void main(String[] args) {
        int[] vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for (int i = 0; i < vetor.length / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = temp;
        }
        
        System.out.println("Vetor invertido:");
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
    }
}
