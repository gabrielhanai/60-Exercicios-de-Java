// EXERCÍCIO 10 - Múltiplos de 3: Crie um vetor de 5 elementos e gere um segundo vetor contendo apenas os números que são múltiplos de 3.


public class ex10_5 {
    public static void main(String[] args) {
        int[] vetor = new int[]{3, 6, 9, 14, 16};
        
        int contador = 0;
        for(int numero : vetor) {
            if(numero % 3 == 0) {
                contador++;
            }
        }
        
        int[] multiplos = new int[contador];
        int indice = 0;
        
        for(int numero : vetor) {
            if(numero % 3 == 0) {
                multiplos[indice] = numero;
                indice++;
            }
        }
        
        System.out.print("Múltiplos de 3: ");
        for(int numero : multiplos) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}