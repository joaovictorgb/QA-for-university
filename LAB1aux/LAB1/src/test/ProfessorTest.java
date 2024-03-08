package test;

import org.junit.jupiter.api.Test;

import main.Disciplina;
import main.Professor;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void obterDisciplinasMinistradas() {
        Professor professor = new Professor("João Silva");
        Disciplina disciplina1 = new Disciplina("Algoritmos e Estruturas de Dados", "ALG456", 90, "Terça 07h-09h | Quarta 07-09h");
        Disciplina disciplina2 = new Disciplina("Algoritmos e Estruturas de Dados", "ALG456", 90, "Terça 07h-09h | Quarta 07-09h");

        professor.adicionarDisciplina(disciplina1);
        professor.adicionarDisciplina(disciplina2);

        assertEquals(2, professor.obterDisciplinasMinistradas().size());
        assertTrue(professor.obterDisciplinasMinistradas().contains(disciplina1));
        assertTrue(professor.obterDisciplinasMinistradas().contains(disciplina2));
    }

}

