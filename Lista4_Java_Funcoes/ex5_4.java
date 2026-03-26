/*
 * EXERCÍCIO 5 - Saudação Personalizada
 * 
 * Faça uma função que receba o nome de uma pessoa (string) 
 * e imprima a mensagem: "Olá, [nome], seja bem-vindo à aula de programação!"
 */
import java.util.Scanner;
public class ex5_4 {
    public static String saudacao(String nome){
        String saud = "Olá, " + nome + ", seja bem-vindo à aula de programação!";
        System.out.println(saud);
        return saud;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        saudacao(nome);
        sc.close();
    }
}
