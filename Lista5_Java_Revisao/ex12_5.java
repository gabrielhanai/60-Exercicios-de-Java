// EXERCÍCIO 12 - Acima da Média: Leia um vetor de 8 elementos float. Calcule a média e 
// imprima apenas os valores que estão acima dessa média.

public class ex12_5 {
    public static void main(String[] args) {
        float[] vetor = new float[]{1.5f, 2.0f, 3.5f, 4.0f, 5.5f, 6.0f, 7.5f, 8.0f};
        float media = 0;
        int somanum = 0;
        for(float numero : vetor){
            somanum += numero;
        }
        media = somanum / vetor.length;

        System.out.println("A média é: " + media);

        for(float numero : vetor){
            if(numero > media){
                System.out.println(numero);
            }
        }
    }
}
