package test;
import static org.junit.Assert.*;
import org.junit.Test;
import exceptions.FiguraException;

public class RetanguloTest {

    @Test
    public void testCalcularArea() throws FiguraException {
        Retangulo retangulo = new Retangulo(4.0, 5.0);
        assertEquals(Double.valueOf(20.0), retangulo.calcularArea()); // Verificar se a área está correta
    }

    @Test
    public void testCalcularPerimetro() throws FiguraException {
        Retangulo retangulo = new Retangulo(3.0, 6.0);
        assertEquals(Double.valueOf(18.0), retangulo.calcularPerimetro()); // Verificar se o perímetro está correto
    }

    @Test
    public void testAlturaNegativa() {
        try {
            new Retangulo(-1.0, 5.0); // Deve lançar uma exceção FiguraException
            fail("Deveria ter lançado FiguraException para altura negativa.");
        } catch (FiguraException e) {
            // Esperado, não fazer nada
        }
    }

    @Test
    public void testLarguraNegativa() {
        try {
            new Retangulo(4.0, -2.0); // Deve lançar uma exceção FiguraException
            fail("Deveria ter lançado FiguraException para largura negativa.");
        } catch (FiguraException e) {
            // Esperado, não fazer nada
        }
    }

    @Test
    public void testAlturaZero() {
        try {
            new Retangulo(0.0, 5.0); // Deve lançar uma exceção FiguraException
            fail("Deveria ter lançado FiguraException para altura igual a zero.");
        } catch (FiguraException e) {
            // Esperado, não fazer nada
        }
    }

    @Test
    public void testLarguraZero() {
        try {
            new Retangulo(4.0, 0.0); // Deve lançar uma exceção FiguraException
            fail("Deveria ter lançado FiguraException para largura igual a zero.");
        } catch (FiguraException e) {
            // Esperado, não fazer nada
        }
    }

    @Test
    public void testToString() throws FiguraException {
        Retangulo retangulo = new Retangulo(5.0, 8.0);
        assertEquals("Retangulo de largura 8.0 e altura 5.0", retangulo.toString()); // Verificar se o método toString() retorna a string esperada
    }
}
