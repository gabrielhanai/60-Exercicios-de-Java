// Faça um algoritmo que leia a altura e o gênero (M/F) de 15 pessoas. 
// Ao final, mostre: a maior e a menor altura, a média de altura das mulheres e o número de homens.
import java.util.Scanner;
public class ex28_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int contm = 0;
        int contf = 0;
        float alturam = 0;
        float maiorAltura = Float.MIN_VALUE;
        float menorAltura = Float.MAX_VALUE;

        System.out.println("Digite a altura e o gênero (M/F) de 15 pessoas: ");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < 15; i++) {
            System.out.println("M/F: ");
            String genero = sc.next();
            System.out.println("Altura: ");
            float altura = sc.nextFloat();

            // Atualiza maior e menor altura
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }

            // Conta homens e soma altura das mulheres
            if (genero.equalsIgnoreCase("M")) {
                contm++;
            } else if (genero.equalsIgnoreCase("F")) {
                contf++;
                alturam += altura;
            } else {
                System.out.println("Gênero inválido. Digite M para masculino ou F para feminino.");
                i--;
                continue;
            }
            System.out.println("------------------------------------------------------------");
        }

        // Calcula média de altura das mulheres
        float mediaAlturaMulheres = contf > 0 ? alturam / contf : 0;

        // Exibe os resultados
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("Número de homens: " + contm);

        sc.close();
    }
}
