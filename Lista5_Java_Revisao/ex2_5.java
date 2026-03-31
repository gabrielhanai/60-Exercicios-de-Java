
// EXERCÍCIO 2 - Produto de Reais: Crie um vetor de float com 4 elementos e calcule o produto (multiplicação) de todos os valores.

public class ex2_5 {
    public static void main(String[] args) {
        float[] vetor = new float[]{1.5f, 2.5f, 3.5f, 4.5f};
        float produto = 1;
        for (float numeros : vetor) {
            produto *= numeros;
        }
        System.out.println(produto);
    }
}
