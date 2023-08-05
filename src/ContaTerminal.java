import java.util.Locale;
import java.util.Scanner;

/**
 * Classe que representa uma conta bancaria
 * @author: Jefferson Pessoa
 * @version 1.0
 * @since 05/08/2023
 */

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o numero da sua agencia: ");
        int agencia = scanner.nextInt();
        
        System.out.println("Digite sua conta: ");
        String conta = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        
        System.out.println("Ola, me chamo " + nome);
        System.out.println("Minha conta é a " + conta + " da agencia " + agencia);
        System.out.println("Meu saldo é R$ " + saldo);
        
        
    }
}


