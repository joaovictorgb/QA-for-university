package testesAdministrativas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Administrativa.Administrativa;

public class TestAdministrativa {

    private Administrativa administrativa;

    @Before
    public void setUp() {
        administrativa = new Administrativa();
    }

    @Test
    public void testObterReunioesAgendadas() {
        String reunioes = administrativa.obterReunioesAgendadas();
        assertNotNull(reunioes);
        assertTrue(reunioes.contains("Reuniões agendadas com a diretoria"));
    }

    @Test
    public void testObterEntrevistas() {
        String entrevistas = administrativa.obterEntrevistas();
        assertNotNull(entrevistas);
        assertTrue(entrevistas.contains("Entrevistas agendadas"));
    }

    @Test
    public void testReunioesAgendadasNaoVazias() {
        String reunioes = administrativa.obterReunioesAgendadas();
        assertNotNull(reunioes);
        assertFalse(reunioes.isEmpty());
    }

    @Test
    public void testEntrevistasAgendadasNaoVazias() {
        String entrevistas = administrativa.obterEntrevistas();
        assertNotNull(entrevistas);
        assertFalse(entrevistas.isEmpty());
    }
}
