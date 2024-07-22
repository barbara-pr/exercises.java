package Escola;

public class PessoaFactory {
    public static Pessoa criarPessoa(String tipo, String nome, String cpf) {
        switch (tipo.toLowerCase()) {
            case "aluno":
                return new Aluno(nome, cpf);
            case "professor":
                return new Professor(nome, cpf);
            default:
                throw new IllegalArgumentException("Tipo de pessoa desconhecido.");
        }
    }
}
