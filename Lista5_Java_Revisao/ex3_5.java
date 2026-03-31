
// EXERCÍCIO 3 - Média de Turma: Desenvolva um programa que utilize um vetor para armazenar as notas de 5 alunos e calcule a média aritmética da turma.
// +1
public class ex3_5 {
    public static void main(String[] args) {
        float[] notas = new float[]{7.5f, 8.0f, 6.5f, 9.0f, 7.0f};
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        float media = soma / notas.length;
        System.out.println("A média da turma é: " + media);
    }
}
