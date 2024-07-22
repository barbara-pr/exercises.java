package Escola;

import java.util.List;

public class CalculoMediaSimples implements CalculoNotaStrategy {
    @Override
    public double calcularNotaFinal(List<Double> notas) {
        double soma = 0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
}
