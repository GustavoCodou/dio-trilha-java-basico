package ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
    public int Numero;
    public String Agencia;
    public String Nome_Cliente;
    public double Saldo;

    public static void main(String[] args) {

        ContaTerminal Conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        // Leitura do número da conta
        System.out.println("Por favor, digite o número da conta:");
        Conta.Numero = scanner.nextInt();

        // Limpar o buffer após nextInt
        scanner.nextLine();

        // Leitura do nome da agência
        System.out.println("Por favor, digite o nome da agência:");
        Conta.Agencia = scanner.nextLine();

        // Leitura do nome do cliente
        System.out.println("Por favor, digite o seu nome:");
        Conta.Nome_Cliente = scanner.nextLine();

        // Leitura do saldo
        System.out.println("Por favor, digite o seu saldo:");
        Conta.Saldo = scanner.nextDouble();

        // Exibindo a mensagem final
        System.out.println("Olá " + Conta.Nome_Cliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + Conta.Agencia + ", número: " + Conta.Numero + ", e seu saldo de R$ " + Conta.Saldo + " já está disponível para saque.");

        scanner.close();
    }
}