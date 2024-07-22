package Escola;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EscolaRepository escolaRepository = EscolaRepository.getInstance();

        Pessoa aluno = PessoaFactory.criarPessoa("aluno", "João", "123.456.789-00");
        Pessoa professor = PessoaFactory.criarPessoa("professor", "Maria", "987.654.321-00");

        escolaRepository.adicionarAluno((Aluno) aluno);
        escolaRepository.adicionarProfessor((Professor) professor);

        Curso curso = new Curso("Engenharia de Software");
        curso.adicionarComponente(new Disciplina("Padrões de Projeto"));
        curso.adicionarComponente(new Disciplina("Desenvolvimento Ágil"));

        escolaRepository.adicionarCurso(curso);

        // Exibir detalhes do curso
        curso.mostrarDetalhes();

        // Exemplo de estratégia de cálculo de notas
        CalculoNotaStrategy calculoNotaStrategy = new CalculoMediaSimples();
        List<Double> notas = Arrays.asList(8.0, 7.5, 9.0);
        double notaFinal = calculoNotaStrategy.calcularNotaFinal(notas);
        System.out.println("Nota final: " + notaFinal);

        // Exemplo de observador de matrícula
        Aluno alunoObserver = (Aluno) aluno;
        alunoObserver.atualizar("Matrícula confirmada no curso de Engenharia de Software.");
    }
}
