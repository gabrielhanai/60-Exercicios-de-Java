import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua altura (em metros): ");
        float altura = scanner.nextFloat();

        System.out.print("Digite o seu peso (em kg): ");
        float peso = scanner.nextFloat();

        System.out.print("Digite o seu sexo (M/F): ");
        String sexo = scanner.next();

        // Calcula o IMC
        float imc = peso / (altura * altura);

        if (sexo.equalsIgnoreCase("M")) {
            if (imc < 20.7) {
                System.out.println("Você está abaixo do peso.");
            } else if (imc >= 20.7 && imc <= 26.4) {
                System.out.println("Você está dentro do peso.");
            } else {
                System.out.println("Você está acima do peso.");
            }
        } else if (sexo.equalsIgnoreCase("F")) {
            if (imc < 19.1) {
                System.out.println("Você está abaixo do peso.");
            } else if (imc >= 19.1 && imc <= 25.8) {
                System.out.println("Você está dentro do peso.");
            } else {
                System.out.println("Você está acima do peso.");
            }
        } else {
            System.out.println("Sexo inválido.");
        }

        scanner.close();
    }
}
