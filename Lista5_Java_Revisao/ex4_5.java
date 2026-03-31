
// EXERCÍCIO 4 - Manipulação de Índices: Crie um vetor com os valores {1, 2, 3, 4, 5}. Substitua o terceiro elemento (índice 2) pelo número 0 e imprima o vetor resultante.
public class ex4_5 {
    public static void main(String[] args) {
        int[] vetor = new int[]{1, 2, 3, 4, 5};
        vetor[2] = 0;
        for(int i = 0; i<5 ;i++){
            System.out.println(vetor[i]);
    }
}
}