// EXERCÍCIO 20 - Estatísticas de Conjunto: Leia a altura e o gênero (M/F) de 15 pessoas usando vetores. 
// Ao final, mostre a maior e menor altura, a média de altura das mulheres e o número de homens.

public class ex20_5 {
    public static void main(String[] args) {
        float[] alturas = new float[]{1.70f, 1.65f, 1.80f, 1.55f, 1.90f, 1.60f, 1.75f, 1.68f, 1.82f, 1.58f, 1.72f, 1.66f, 1.78f, 1.62f, 1.85f};
        char[] generos = new char[]{
            'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M', 'F', 'M'
        };

        float maiorAltura = alturas[0];
        float menorAltura = alturas[0];
        float somaAlturaMulheres = 0;
        int contadorMulheres = 0;
        int contadorHomens = 0;
        for(int i = 0; i < alturas.length; i++) {
            if(alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if(alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
            if(generos[i] == 'F') {
                somaAlturaMulheres += alturas[i];
                contadorMulheres++;
            } else if(generos[i] == 'M') {
                contadorHomens++;
            }
        }
        float mediaAlturaMulheres = contadorMulheres > 0 ? somaAlturaMulheres / contadorMulheres : 0;
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("Número de homens: " + contadorHomens);
        
    }
}
