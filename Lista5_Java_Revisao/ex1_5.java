
//EXERCÍCIO 1 - Soma Simples: Crie um vetor de inteiros com 3 elementos e imprima a soma dos valores armazenados.
public class ex1_5 {
    public static void main(String[] args){
int soma = 0;
   int[] vetor = new int[]{1, 2, 3};

   for(int numeros : vetor){
    soma += numeros;
   } 

   System.out.println(soma);
}
}
