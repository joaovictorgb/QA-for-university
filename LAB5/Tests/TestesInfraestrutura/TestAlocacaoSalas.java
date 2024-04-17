package Tests.TestesInfraestrutura;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;

import Infraestrutura.AlocacaoSalas;

public class TestAlocacaoSalas {

    private AlocacaoSalas alocacaoSalas;

    @Before
    public void setUp() {
        alocacaoSalas = new AlocacaoSalas();
    }

    @Test
    public void testAlocarSala() {
        alocacaoSalas.alocarSala("Sala A", "Pessoa A");
        alocacaoSalas.alocarSala("Sala B", "Pessoa B");

        assertEquals("Pessoa A", alocacaoSalas.verificarAlocacaoSala("Sala A"));
        assertEquals("Pessoa B", alocacaoSalas.verificarAlocacaoSala("Sala B"));
    }

    @Test
    public void testDesalocarSala() {
        alocacaoSalas.alocarSala("Sala C", "Pessoa C");
        alocacaoSalas.desalocarSala("Sala C");

        assertNull(alocacaoSalas.verificarAlocacaoSala("Sala C"));
    }

    @Test
    public void testListarAlocacoesSalas() {
        alocacaoSalas.alocarSala("Sala X", "Pessoa X");
        alocacaoSalas.alocarSala("Sala Y", "Pessoa Y");
        String listaAlocacoes = alocacaoSalas.listarAlocacoesSalas();

        assertTrue(listaAlocacoes.contains("Sala X"));
        assertTrue(listaAlocacoes.contains("Sala Y"));
        assertTrue(listaAlocacoes.contains("Pessoa X"));
        assertTrue(listaAlocacoes.contains("Pessoa Y"));
    }
}