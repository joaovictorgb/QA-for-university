package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import entidades.*;

public class CirculoTest {

    @Test
    public void criarCirculoTest() throws ExcecaoEntidade{
        Circulo c = new Circulo(5);
        assertEquals(5, c.getRaio(),0.1);
    }

    @Test (expected = ExcecaoEntidade.class)
    public void criarCirculoInvalidoTest() throws ExcecaoEntidade {
        new Circulo(-1);
    }
   
}
