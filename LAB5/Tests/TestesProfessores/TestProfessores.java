package Tests.TestesProfessores;



import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Professores.Professores;

public class TestProfessores {

    private Professores professores;

    @Before
    public void setUp() {
        professores = new Professores();
    }

    @Test
    public void testObterAlocacaoPorDisciplina() {
        String alocacao = professores.obterAlocacaoPorDisciplina();
        assertNotNull(alocacao);
        assertTrue(alocacao.contains("Alocação de professores por disciplina"));
    }

    @Test
    public void testObterTempoDeCasa() {
        String tempoDeCasa = professores.obterTempoDeCasa();
        assertNotNull(tempoDeCasa);
        assertTrue(tempoDeCasa.contains("Tempo de casa dos professores"));
    }
}
