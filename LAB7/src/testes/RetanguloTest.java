package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import entidades.*;

public class RetanguloTest {

    @Test
    public void testCriarRetanguloLargura() throws ExcecaoEntidade {
        Retangulo retangulo = new Retangulo(5, 4);
        assertEquals(5, retangulo.getLargura(), 0.1);
    }

    @Test
    public void testCriarRetanguloAltura() throws ExcecaoEntidade {
        Retangulo retangulo = new Retangulo(5, 4);
        assertEquals(4, retangulo.getAltura(), 0.1);
    }

    @Test (expected = ExcecaoEntidade.class)
    public void criarRetanguloLarguraInvalidoTest() throws ExcecaoEntidade {
        new Retangulo(-1,7);
    }
   
    @Test (expected = ExcecaoEntidade.class)
    public void criarRetanguloAlturaInvalidaTest() throws ExcecaoEntidade {
        new Retangulo(5,0);
    }

}