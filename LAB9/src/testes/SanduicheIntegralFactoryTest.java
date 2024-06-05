package testes;

import org.junit.Test;
import factorys.SanduicheIntegralFactory;
import entidades.Sanduiche;

import static org.junit.Assert.*;

public class SanduicheIntegralFactoryTest {

    @Test
    public void testeCriarSanduicheIntegral() {
        SanduicheIntegralFactory factory = new SanduicheIntegralFactory();
        Sanduiche sanduiche = factory.preparar();

        assertNotNull(sanduiche);
        assertEquals("Pão Integral, Queijo Mussarela, Presunto de Peru, Ovo de Capoeira, Tomate", sanduiche.toString());
    }
}