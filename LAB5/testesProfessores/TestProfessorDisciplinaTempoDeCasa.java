package testesProfessores;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import Professores.ProfessorDisciplinaTempoDeCasa;

public class TestProfessorDisciplinaTempoDeCasa {

    private ProfessorDisciplinaTempoDeCasa professor;

    @Before
    public void setUp() {
        professor = new ProfessorDisciplinaTempoDeCasa();
    }

    @Test
    public void testGetProfessorNome() {
        String nomeProfessor = professor.getProfessorNome();
        assertNotNull(nomeProfessor);
        assertTrue(nomeProfessor.length() == 4);
    }

    @Test
    public void testGetDisciplinaNome() {
        String nomeDisciplina = professor.getDisciplinaNome();
        assertNotNull(nomeDisciplina);
        assertTrue(nomeDisciplina.length() > 0);
    }

    @Test
    public void testGetTempoDeCasa() {
        int tempoDeCasa = professor.getTempoDeCasa();
        assertTrue(tempoDeCasa >= 0 && tempoDeCasa <= 40);
    }
}
