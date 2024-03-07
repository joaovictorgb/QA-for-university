package entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void obterDisciplinasMinistradas() {
        Professor professor = new Professor("João Silva", "Segunda 8h-10h");
        Disciplina disciplina1 = new Disciplina("Matemática Discreta", "MAT123", 60);
        Disciplina disciplina2 = new Disciplina("Algoritmos e Estruturas de Dados", "ALG456", 90);

        professor.adicionarDisciplina(disciplina1);
        professor.adicionarDisciplina(disciplina2);

        assertEquals(2, professor.obterDisciplinasMinistradas().size());
        assertTrue(professor.obterDisciplinasMinistradas().contains(disciplina1));
        assertTrue(professor.obterDisciplinasMinistradas().contains(disciplina2));
    }

    @Test
    void obterHorario() {
        Professor professor = new Professor("Maria Santos", "Terça 14h-16h");
        assertEquals("Terça 14h-16h", professor.obterHorario());
    }
}
