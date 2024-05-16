import java.util.Scanner;

public class ChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo disponível:");
        double saldo = scanner.nextDouble(); // Saldo disponível na conta

        System.out.println("Digite o valor do saque:");
        double saque = scanner.nextDouble(); // Valor do saque solicitado

        double limiteChequeEspecial = 500; // Limite do cheque especial

        // Verifique se o saque não ultrapassa o saldo disponível na conta:
        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
        } else if (saque > saldo + limiteChequeEspecial) { //se o saque excede o saldo disponível mais o limite do cheque especial.
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
        } else {
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
        }

        scanner.close();
    }
}
