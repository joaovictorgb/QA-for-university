package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import entidades.*;

public class TrapezioTest {

    @Test (expected = ExcecaoEntidade.class)
    public void criarTrapezioLadoInvalidoTest() throws ExcecaoEntidade {
        new Trapezio(-1,5,7,6,6);
    }
   
    @Test (expected = ExcecaoEntidade.class)
    public void criarTrapezioInvalidoTest() throws ExcecaoEntidade {
        new Trapezio(6,6,8,3,2);
    }

    @Test
    public void testCriarTrapezioBaseMenor() throws ExcecaoEntidade {
        Trapezio trapezio = new Trapezio(3, 5, 7, 6, 6);
        assertEquals(3, trapezio.getBaseMenor(), 0.1);
    }

    @Test
    public void testCriarTrapezioBaseMaior() throws ExcecaoEntidade {
        Trapezio trapezio = new Trapezio(3, 5, 7, 6, 6);
        assertEquals(5, trapezio.getBaseMaior(), 0.1);
    }

    @Test
    public void testCriarTrapezioAltura() throws ExcecaoEntidade {
        Trapezio trapezio = new Trapezio(3, 5, 7, 6, 6);
        assertEquals(7, trapezio.getAltura(), 0.1);
    }

    @Test
    public void testCriarTrapezioLado1() throws ExcecaoEntidade {
        Trapezio trapezio = new Trapezio(3, 5, 7, 6, 6);
        assertEquals(6, trapezio.getLado1(), 0.1);
    }

    @Test
    public void testCriarTrapezioLado2() throws ExcecaoEntidade {
        Trapezio trapezio = new Trapezio(3, 5, 7, 6, 6);
        assertEquals(6, trapezio.getLado2(), 0.1);
    }

}