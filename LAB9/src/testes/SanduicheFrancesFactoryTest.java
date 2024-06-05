package testes;

import org.junit.Test;
import factorys.SanduicheFrancesFactory;
import entidades.Sanduiche;

import static org.junit.Assert.*;

public class SanduicheFrancesFactoryTest {

    @Test
    public void testeCriarSanduicheFrances() {
        SanduicheFrancesFactory factory = new SanduicheFrancesFactory();
        Sanduiche sanduiche = factory.criarSanduiche();

        assertNotNull(sanduiche);
        assertEquals("Pão Francês, Queijo Cheddar, Presunto de Frango, Ovo de Capoeira, Tomate", sanduiche.toString());
    }
}