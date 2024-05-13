package testes;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import visitors.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class VisitorDesenharTest {
    VisitorIF vd;
    ByteArrayOutputStream outContent;

    @Before
    public void setup() {
        vd = new VisitorDesenhar();
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testDesenharRetangulo() {
        vd.visitaRetangulo(null);
        assertTrue(outContent.toString().contains("Retângulo desenhado"));
    }


    @Test
    public void testDesenharCirculo() {
        vd.visitaCirculo(null);
        assertTrue(outContent.toString().contains("Círculo desenhado"));
    }

    @Test
    public void testDesenharTrapezio() {
        vd.visitaTrapezio(null);
        assertTrue(outContent.toString().contains("Trapezio desenhado"));
    }

    @Test
    public void testDesenharTriangulo() {
        vd.visitaTriangulo(null);
        assertTrue(outContent.toString().contains("Triângulo desenhado"));
    }
}