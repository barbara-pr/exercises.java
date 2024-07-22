package Escola;

import java.util.ArrayList;
import java.util.List;

public class EscolaRepository {
    private static EscolaRepository instance;
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Curso> cursos;

    private EscolaRepository() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    public static synchronized EscolaRepository getInstance() {
        if (instance == null) {
            instance = new EscolaRepository();
        }
        return instance;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    // outros métodos para gerenciamento de alunos, professores e cursos
}
