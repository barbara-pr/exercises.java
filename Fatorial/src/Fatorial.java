import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = res.nextInt();

        long fatorial = 1;

        // Use StringBuilder para operações repetitivas ou concatenar strings dentro de loops.

        StringBuilder processo = new StringBuilder(); // Usado para construir a string do processo de multiplicação

        for (int i = numero; i > 0; i--) {
            fatorial *= i;
            processo.append(i); // Cada número é adicionado ao StringBuilder
            if (i > 1) { // Se o número não for o último, um " x " é adicionado após o número (append = ao final da sequência)
                processo.append(" x ");
            }
        }

        System.out.println("O cálculo a ser feito é: " + processo.toString());
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
