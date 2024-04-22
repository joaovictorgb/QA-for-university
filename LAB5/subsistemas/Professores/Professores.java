package Professores;

import java.util.ArrayList;

public class Professores {
    ArrayList<ProfessorDados> professores = new ArrayList<ProfessorDados>();

    public Professores() {
        // Gerar professores fictícios
        for (int i = 0; i < 5; i++) {
            ProfessorDados professor = new ProfessorDados();
            this.professores.add(professor);
        }
    }

    public String obterAlocacaoPorDisciplina() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("\n-> Alocação de professores por disciplina\n");

        for (ProfessorDados professor : this.professores) {
            resultado.append(professor.getProfessorNome() + " alocado para lecionar "
                    + professor.getDisciplinaNome() + ".\n");
        }

        return resultado.toString();
    }

    public String obterTempoDeCasa() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("\n-> Tempo de casa dos professores\n");

        for (ProfessorDados professor : this.professores) {
            resultado.append(professor.getProfessorNome() + " tem " + professor.getTempoDeCasa()
                    + " anos de tempo de casa.\n");
        }

        return resultado.toString();
    }
}