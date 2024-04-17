package Tests.TestesAlunos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Alunos.Historico;

public class TestHistorico {
       private Historico historico;

    @Before
    public void setUp() {
        historico = new Historico();
    }

    @Test
    public void testAdicionarDisciplinaConcluida() {
        historico.adicionarDisciplinaConcluida("Matemática");
        historico.adicionarDisciplinaConcluida("História");
        String disciplinas = historico.obterHistorico();
        assertNotNull(disciplinas);
        assertTrue(disciplinas.contains("Matemática"));
        assertTrue(disciplinas.contains("História"));
    }
}
