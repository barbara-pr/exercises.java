import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);
        System.out.print("Quantos números da sequência de Fibonacci você quer ver? ");
        int num = res.nextInt();
        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: " + a + " " + b);
        for (int i = 2; i < num; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}
