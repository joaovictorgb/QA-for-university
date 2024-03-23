package test;

import entities.Circulo;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import exceptions.FiguraException;

public class CirculoTest {

    private Circulo circulo;

    @Before
    public void setUp() throws FiguraException {
        circulo = new Circulo(5.0); // Raio positivo para testes
    }

    @Test
    public void testCalcularArea() {
        assertEquals(78.5, circulo.calcularArea(), 0.1); // Verifica se a área é igual a 78.5 com uma margem de erro de 0.1
    }

    @Test
    public void testCalcularPerimetro() {
        assertEquals(31.4, circulo.calcularPerimetro(), 0.1); // Verifica se o perímetro é igual a 31.4 com uma margem de erro de 0.1
    }

    @Test(expected = FiguraException.class)
    public void testCriarCirculoComRaioNegativo() throws FiguraException {
        new Circulo(-1.0); // Deve lançar uma exceção FiguraException
    }

    @Test(expected = FiguraException.class)
    public void testCriarCirculoComRaioZero() throws FiguraException {
        new Circulo(0.0); // Deve lançar uma exceção FiguraException
    }

    @Test
    public void testToString() {
        assertEquals("Circulo de raio 5.0", circulo.toString());
    }
}
