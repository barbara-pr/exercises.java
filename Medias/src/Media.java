import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Celina", "Marcos", "Helena", "Luís"};

        double media = calcularMedia(alunos, scan);

        System.out.printf("A média da turma é %.1f", media);
    }

    public static double calcularMedia(String[] alunos, Scanner scanner){
        double soma = 0;
        for (String aluno : alunos){
            System.out.printf("Nota do(a) aluno(a) %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }
}