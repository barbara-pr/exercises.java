import java.util.Scanner;

public class Semana {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite o dia: ");
        byte dia = scanner.nextByte();

        switch (dia){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        scanner.close();
    }
}
