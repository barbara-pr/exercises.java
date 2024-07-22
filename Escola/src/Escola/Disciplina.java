package Escola;

public class Disciplina implements CursoComponent {
    private String nome;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Disciplina: " + nome);
    }
}
