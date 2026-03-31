// EXERCÍCIO 9 - Filtro "Maior que 5": Crie um vetor de 10 float. 
// Gere um novo vetor contendo apenas os elementos que são maiores que 5.0.

public class ex9_5 {
    public static void main(String[] args) {
        float[] vetor = new float[]{2.5f, 3.5f, 5.5f, 4.9f, 5.0f, 6.2f, 7.9f, 8.9f, 9.4f, 3.1f};
        for(float numero : vetor){
            if(numero > 5.0){
                System.out.println(numero);
            }
        }
    }
}