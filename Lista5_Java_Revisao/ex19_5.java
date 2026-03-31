// EXERCÍCIO 19 - Sistema de Login Limitado: Desenvolva uma função de validação de senha (ex: "1234") 
// que permita ao usuário apenas 3 tentativas. Se errar todas, informe que a conta foi bloqueada.
import java.util.Scanner;
public class ex19_5 {
    public static boolean validarSenha(String senha) {
        return "1234".equals(senha);
    }
    public static void main(String[] args) {
        int tentativas = 3;
        Scanner sc = new Scanner(System.in);
        boolean acessoConcedido = false;
        while (tentativas > 0 && !acessoConcedido) {
            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();
            if (validarSenha(senha)) {
                acessoConcedido = true;
                System.out.println("Acesso concedido!");
            } else {
                tentativas--;
                System.out.println("Senha incorreta. Tentativas restantes: " + tentativas);
            }
        }
    }
}
