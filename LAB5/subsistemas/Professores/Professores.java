package Professores;

import java.util.ArrayList;

public class Professores {
    ArrayList<ProfessorDisciplinaTempoDeCasa> professores = new ArrayList<ProfessorDisciplinaTempoDeCasa>();

    public Professores() {
        // Gerar professores fictícios
        for (int i = 0; i < 5; i++) {
            ProfessorDisciplinaTempoDeCasa professor = new ProfessorDisciplinaTempoDeCasa();
            this.professores.add(professor);
        }
    }

    public String obterAlocacaoPorDisciplina() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("\n-> Alocação de professores por disciplina\n");

        for (ProfessorDisciplinaTempoDeCasa professor : this.professores) {
            resultado.append(professor.getProfessorNome() + " alocado para lecionar "
                    + professor.getDisciplinaNome() + ".\n");
        }

        return resultado.toString();
    }

    public String obterTempoDeCasa() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("\n-> Tempo de casa dos professores\n");

        for (ProfessorDisciplinaTempoDeCasa professor : this.professores) {
            resultado.append(professor.getProfessorNome() + " tem " + professor.getTempoDeCasa()
                    + " anos de tempo de casa.\n");
        }

        return resultado.toString();
    }
}