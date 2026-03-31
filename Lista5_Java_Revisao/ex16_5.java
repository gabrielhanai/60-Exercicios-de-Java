// EXERCÍCIO 16 - Função de Busca: Crie uma função que receba um vetor de 10 posições e um valor X. 
// A função deve retornar o índice onde X se encontra ou −1 caso não exista.

public class ex16_5 {
    public static int busca(int[] vetor, int x) {
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 5;
        int resultado = busca(vetor, x);
        
        if(resultado != -1) {
            System.out.println("O valor " + x + " está no índice: " + resultado);
        } else {
            System.out.println("O valor " + x + " não foi encontrado no vetor.");
        }
    }
}
