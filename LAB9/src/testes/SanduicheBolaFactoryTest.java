package testes;

import org.junit.Test;
import factorys.SanduicheBolaFactory;
import entidades.Sanduiche;

import static org.junit.Assert.*;

public class SanduicheBolaFactoryTest {

    @Test
    public void testeCriarSanduicheBola() {
        SanduicheBolaFactory factory = new SanduicheBolaFactory();
        Sanduiche sanduiche = factory.criarSanduiche();

        assertNotNull(sanduiche);
        assertEquals("Pão Bola, Queijo Prato, Presunto de Peru, Ovo de Granja, Tomate", sanduiche.toString());
    }
}