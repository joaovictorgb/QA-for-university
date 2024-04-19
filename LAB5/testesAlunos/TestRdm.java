package testesAlunos;



import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Alunos.RDM;

public class TestRdm {

    private RDM rdm;

    @Before
   public void setUp() {
        rdm = new RDM();
    }

    @Test
    public void testAdicionarNota() {
        rdm.adicionarNota("Matemática", 8.5);
        rdm.adicionarNota("História", 7.0);
    }

    @Test
    public void testObterNota() {
        rdm.adicionarNota("Matemática", 8.5);
        rdm.adicionarNota("História", 7.0);
        assertEquals(8.5, rdm.obterNota("Matemática"),0);
        assertEquals(7.0, rdm.obterNota("História"),0);
        assertEquals(0.0, rdm.obterNota("Inglês"),0); // Nota não adicionada, deve retornar 0.0
    }

    @Test
    public void testCalcularRDM() {
        rdm.adicionarNota("Matemática", 8.5);
        rdm.adicionarNota("História", 7.0);
        assertEquals(7.75, rdm.calcularRDM(),0);
    }
}

