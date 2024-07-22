package Escola;

import java.util.List;

public class Aluno extends Pessoa implements MatriculaObserver {
    // outros atributos e métodos específicos de Aluno

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Aluno " + getNome() + " recebeu a notificação: " + mensagem);
    }
}
