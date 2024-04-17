package Alunos;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<String> disciplinasConcluidas;

    public Historico() {
        this.disciplinasConcluidas = new ArrayList<>();
    }

    public void adicionarDisciplinaConcluida(String disciplina) {
        disciplinasConcluidas.add(disciplina);
    }

    public String obterHistorico() {
        StringBuilder historicoAluno = new StringBuilder();
        historicoAluno.append("Disciplinas concluídas:\n");
        for (String disciplina : disciplinasConcluidas) {
            historicoAluno.append(disciplina).append("\n");
        }
        return historicoAluno.toString();
    }
    
}