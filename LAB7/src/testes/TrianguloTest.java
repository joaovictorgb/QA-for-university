package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import entidades.*;

public class TrianguloTest {

    @Test (expected = ExcecaoEntidade.class)
    public void criarTrianguloLadoInvalidoTest() throws ExcecaoEntidade {
        new Triangulo(-1,3,6,4);
    }
   
    @Test (expected = ExcecaoEntidade.class)
    public void criarTrianguloInvalidoTest() throws ExcecaoEntidade {
        new Triangulo(2,5,8,3);
    }

    @Test
    public void testCriarTrianguloBase() throws ExcecaoEntidade {
        Triangulo triangulo = new Triangulo(5, 4, 3, 3);
        assertEquals(5, triangulo.getBase(), 0.1);
    }

    @Test
    public void testCriarTrianguloAltura() throws ExcecaoEntidade {
        Triangulo triangulo = new Triangulo(5, 4, 3, 3);
        assertEquals(4, triangulo.getAltura(), 0.1);
    }

    @Test
    public void testCriarTrianguloLado1() throws ExcecaoEntidade {
        Triangulo triangulo = new Triangulo(5, 4, 3, 3);
        assertEquals(3, triangulo.getLado1(), 0.1);
    }

    @Test
    public void testCriarTrianguloLado2() throws ExcecaoEntidade {
        Triangulo triangulo = new Triangulo(5, 4, 3, 3);
        assertEquals(3, triangulo.getLado2(), 0.1);
    }


}