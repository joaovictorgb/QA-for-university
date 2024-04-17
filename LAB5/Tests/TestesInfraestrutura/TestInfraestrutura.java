package Tests.TestesInfraestrutura;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Infraestrutura.Infraestrutura;

public class TestInfraestrutura {
       private Infraestrutura infraestrutura;

    @Before
    public void setUp() {
        infraestrutura = new Infraestrutura();
    }

    @Test
    public void testAlocarSala() {
        infraestrutura.alocarSala("Sala A", "Pessoa A");
        infraestrutura.alocarSala("Sala B", "Pessoa B");

        String listaAlocacoes = infraestrutura.obterAlocacaoSalas();
        assertTrue(listaAlocacoes.contains("Sala A"));
        assertTrue(listaAlocacoes.contains("Sala B"));
        assertTrue(listaAlocacoes.contains("Pessoa A"));
        assertTrue(listaAlocacoes.contains("Pessoa B"));
    }

    @Test
    public void testDesalocarSala() {
        infraestrutura.alocarSala("Sala C", "Pessoa C");
        infraestrutura.desalocarSala("Sala C");

        String listaAlocacoes = infraestrutura.obterAlocacaoSalas();
        assertFalse(listaAlocacoes.contains("Sala C"));
        assertFalse(listaAlocacoes.contains("Pessoa C"));
    }
}
