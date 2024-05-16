import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite diário de saques:");
        double limiteDiario = scanner.nextDouble();

        // Loop 'for' para iterar sobre os saques
        for (;;) { // Loop infinito
            System.out.println("Digite o valor do saque (ou 0 para encerrar):");
            if (!scanner.hasNextDouble()) {
                System.out.println("Entrada invalida. Transacoes encerradas.");
                break;
            }

            double valorSaque = scanner.nextDouble();

            // Verifique se o valor do saque é zero, encerrando as transações
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            // Verifique se o valor do saque não ultrapassa o limite diário
            if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                // Subtraia o valor do saque do limite diário
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }

        scanner.close();
    }
}