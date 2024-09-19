import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco DIO!");
        System.out.println("Por favor, insira os detalhes da sua conta.");

        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Saldo: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}

