// EXERCÍCIO 17 - Verificador de Ordem: Desenvolva uma função que receba um vetor e verifique se os elementos estão em ordem crescente.

public class ex17_5 {
    public static boolean estaEmOrdemCrescente(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < vetor[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] vetor = new int[]{1, 2, 3, 4, 5};
        if (estaEmOrdemCrescente(vetor)) {
            System.out.println("Os elementos estão em ordem crescente.");
        } else {
            System.out.println("Os elementos não estão em ordem crescente.");
        }
    }
}
