package Alunos;

import java.util.HashMap;
import java.util.Map;

public class RDM {
    private Map<String, Double> notas;

    public RDM() {
        this.notas = new HashMap<>();
    }

    public void adicionarNota(String disciplina, double nota) {
        notas.put(disciplina, nota);
    }

    public double obterNota(String disciplina) {
        return notas.getOrDefault(disciplina, 0.0);
    }

    public double calcularRDM() {
        double somaNotas = 0.0;
        int totalDisciplinas = notas.size();

        for (Double nota : notas.values()) {
            somaNotas += nota;
        }

        if (totalDisciplinas > 0) {
            return somaNotas / totalDisciplinas;
        } else {
            return 0.0; 
        }
    }
}
