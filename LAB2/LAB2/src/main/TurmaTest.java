package main;

import static org.junit.Assert.*;
import org.junit.Test;

public class TurmaTest {

    @Test
    public void testConstrutor() {
        Disciplina disciplina = new Disciplina("Algoritmos", "ALG123", 60);
        Turma turma = new Turma(1, disciplina, "B104", "Segunda 14h-16h");
        assertEquals(1, turma.getId());
        assertEquals(disciplina, turma.getDisciplina());
        assertEquals("B104", turma.getSala());
        assertEquals("Segunda 14h-16h", turma.getHorario());
    }

   
}
