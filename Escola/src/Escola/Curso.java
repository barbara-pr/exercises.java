package Escola;

import java.util.ArrayList;
import java.util.List;

public class Curso implements CursoComponent {
    private String nome;
    private List<CursoComponent> componentes = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void adicionarComponente(CursoComponent componente) {
        componentes.add(componente);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Curso: " + nome);
        for (CursoComponent componente : componentes) {
            componente.mostrarDetalhes();
        }
    }
}
