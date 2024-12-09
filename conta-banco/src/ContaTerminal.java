import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //chamando o metodo scanner para receber entrada de dados
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" BEM VINDO AO BANCO JAVA!");
        System.out.println("---------------------------");


        System.out.println("Digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o numero da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Qual valor deseja deposistar? ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado(a) por criar uma conta em nosso banco, sua agência é: "
                + agencia + ", conta: " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

    }
}