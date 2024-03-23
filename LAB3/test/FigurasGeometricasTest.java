package tests;

import entities.FigurasGeometricas;
import exceptions.FiguraException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FigurasGeometricasTest {

    @Test
    public void testAreaDaFigura() throws FiguraException {
        FigurasGeometricas fig = new FigurasGeometricas(10, 5, 7, 25);
        assertEquals("50.0", fig.areaDaFigura(FigurasGeometricas.R));
        assertEquals("25.0", fig.areaDaFigura(FigurasGeometricas.Q));
        assertEquals("1963.4954084936207", fig.areaDaFigura(FigurasGeometricas.C));
        assertThrows(FiguraException.class, () -> fig.areaDaFigura(-1));
        assertThrows(FiguraException.class, () -> fig.areaDaFigura(5));
    }

    @Test
    public void testToStringDaFigura() throws FiguraException {
        FigurasGeometricas fig = new FigurasGeometricas(10, 5, 7, 25);
        assertEquals("Retângulo de altura 10.0 e largura 5.0", fig.toStringDaFigura(FigurasGeometricas.R));
        assertEquals("Quadrado de lado 7.0", fig.toStringDaFigura(FigurasGeometricas.Q));
        assertEquals("Círculo de raio 25.0", fig.toStringDaFigura(FigurasGeometricas.C));
        assertThrows(FiguraException.class, () -> fig.toStringDaFigura(-1));
        assertThrows(FiguraException.class, () -> fig.toStringDaFigura(5));
    }

    @Test
    public void testPerimetroDaFigura() throws FiguraException {
        FigurasGeometricas fig = new FigurasGeometricas(10, 5, 7, 25);
        assertEquals("30.0", fig.PerimetroDaFigura(FigurasGeometricas.R));
        assertEquals("28.0", fig.PerimetroDaFigura(FigurasGeometricas.Q));
        assertEquals("157.07963267948966", fig.PerimetroDaFigura(FigurasGeometricas.C));
        assertThrows(FiguraException.class, () -> fig.PerimetroDaFigura(-1));
        assertThrows(FiguraException.class, () -> fig.PerimetroDaFigura(5));
    }

    @Test
    public void testAreaNegativa() {
        assertThrows(FiguraException.class, () -> {
            new FigurasGeometricas(-10, 5, 7, 25);
        });
    }

    @Test
    public void testPerimetroNegativo() {
        assertThrows(FiguraException.class, () -> {
            new FigurasGeometricas(10, -5, 7, 25);
        });
    }

    @Test
    public void testRetanguloCalculaArea() throws FiguraException {
        Retangulo retangulo = new Retangulo(10, 5);
        assertEquals(50.0, retangulo.calcularArea());
    }

    @Test
    public void testRetanguloCalculaPerimetro() throws FiguraException {
        Retangulo retangulo = new Retangulo(10, 5);
        assertEquals(30.0, retangulo.calcularPerimetro());
    }

    @Test
    public void testQuadradoCalculaArea() throws FiguraException {
        Quadrado quadrado = new Quadrado(7);
        assertEquals(49.0, quadrado.calcularArea());
    }

    @Test
    public void testQuadradoCalculaPerimetro() throws FiguraException {
        Quadrado quadrado = new Quadrado(7);
        assertEquals(28.0, quadrado.calcularPerimetro());
    }

    @Test
    public void testCirculoCalculaArea() throws FiguraException {
        Circulo circulo = new Circulo(25);
        assertEquals(1963.4954084936207, circulo.calcularArea());
    }

    @Test
    public void testCirculoCalculaPerimetro() throws FiguraException {
        Circulo circulo = new Circulo(25);
        assertEquals(157.07963267948966, circulo.calcularPerimetro());
    }

    @Test
    public void testFiguraException() {
        assertThrows(FiguraException.class, () -> {
            throw new FiguraException("Teste de exceção");
        });
    }
}
