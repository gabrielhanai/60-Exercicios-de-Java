/*
 * EXERCÍCIO 12 - Validação de Senha
 * 
 * Faça uma função que peça ao usuário para digitar uma senha 
 * e só retorne true quando a senha for "1234". Use do while.
 */
import java.util.Scanner;
public class ex12_4 {
    public static boolean validarSenha(String senha){
        return senha.equals("1234");
    }
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String senha;
        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();
        } while (!validarSenha(senha));
        System.out.println("Senha válida!");
        scanner.close();
    }
}
