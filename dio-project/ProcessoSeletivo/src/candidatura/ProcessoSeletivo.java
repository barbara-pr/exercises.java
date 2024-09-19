package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    public static void main(String[] args){
        String[] candidatos = {"Felipe", "Márcia", "Ana", "Caio", "Fred"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso.");

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
        else
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas " + tentativasRealizadas + " realizada.");
    }

    static boolean atender(){
        return new Random().nextInt(3)==1; //se for igual a 1 significa que atendeu, do contrário vai forçar a chamada de novo
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"Felipe", "Márcia", "Ana", "Caio", "Fred"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento.");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n° " + (indice+1) + " é " + candidatos[indice]); //(indice+1) é para,a na hora da impressão ficar 1 se o índice for 0 etc
        }
        System.out.println("Forma abreviada de interação for each");

        for(String candidato: candidatos){ //a variável candidato vai interagir sobre todos os elementos do array
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecionandoCandidatos(){
        String[] candidatos = {"Felipe", "Márcia", "Ana", "Caio", "Fred", "Daniela", "Jorge", "Renata", "Thiago", "Cléo"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0; //índices do array
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O(a) candidato(a) " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido)
                System.out.println("O(a) candidato(a) " + candidato + " foi selecionado(a) para a vaga.");
                candidatosSelecionados++;

            candidatosAtual++; //para passar para o próximo índice do array e validar no loop
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200); //atribui aleatoriamente salários desejados pelos candidatos
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO");

        else if(salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");

        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");

    }
}