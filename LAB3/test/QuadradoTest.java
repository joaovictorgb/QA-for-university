package test;

import static org.junit.Assert.*;
import org.junit.Test;
import exceptions.FiguraException;

public class QuadradoTest {

    @Test
    public void testCalcularArea() throws FiguraException {
        Quadrado quadrado = new Quadrado(4.0);
        assertEquals(Double.valueOf(16.0), quadrado.calcularArea()); // Verificar se a área está correta
    }

    @Test
    public void testCalcularPerimetro() throws FiguraException {
        Quadrado quadrado = new Quadrado(3.0);
        assertEquals(Double.valueOf(12.0), quadrado.calcularPerimetro()); // Verificar se o perímetro está correto
    }

    @Test
    public void testLadoNegativo() {
        try {
            new Quadrado(-1.0); // Deve lançar uma exceção FiguraException
            fail("Deveria ter lançado FiguraException para largura negativa.");
        } catch (FiguraException e) {
            // Esperado, não fazer nada
        }
    }

    @Test
    public void testLadoZero() {
        try {
            new Quadrado(0.0); // Deve lançar uma exceção FiguraException
            fail("Deveria ter lançado FiguraException para largura igual a zero.");
        } catch (FiguraException e) {
            // Esperado, não fazer nada
        }
    }

    @Test
    public void testToString() throws FiguraException {
        Quadrado quadrado = new Quadrado(5.0);
        assertEquals("Quadrado de lado 5.0", quadrado.toString()); // Verificar se o método toString() retorna a string esperada
    }
}
