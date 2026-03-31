// EXERCÍCIO 15 - Soma de Dois Vetores: Leia dois vetores A e B de tamanho n. 
// Gere um vetor C onde cada posição i seja a soma de A[i]+B[i].

public class ex15_5 {
    public static void main(String[] args) {
        int n = 5; // Tamanho dos vetores
        int[] A = new int[]{1, 2, 3, 4, 5};
        int[] B = new int[]{6, 7, 8, 9, 10};
        int[] C = new int[n];
        
        for(int i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
        }
        
        System.out.println("Vetor C (soma de A e B):");
        for(int i = 0; i < n; i++) {
            System.out.println(C[i]);
        }
    }
}
