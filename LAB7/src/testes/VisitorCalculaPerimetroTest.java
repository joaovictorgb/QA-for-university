package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import entidades.*;
import visitors.*;

public class VisitorCalculaPerimetroTest {
    VisitorIF cp;
    Retangulo r;
    Circulo c;
    Trapezio t;
    Triangulo tr;

    @Before
    public void setup() throws ExcecaoEntidade {
        cp = new VisitorCalculaPerimetro();
        r = new Retangulo(2, 4);
        c = new Circulo(2);
        t = new Trapezio(2, 4, 3, 2, 2);
        tr = new Triangulo(3, 4, 2, 2);
    }

    @Test
    public void testPerimetroRetangulo() {
        assertEquals(12, cp.visitaRetangulo(r), 0.1);
    }

    @Test
    public void testPerimetroCirculo() {
        assertEquals(12.56, cp.visitaCirculo(c), 0.01);
    }

    @Test
    public void testPerimetroTrapezio() {
        assertEquals(10, cp.visitaTrapezio(t), 0.1);
    }

    @Test
    public void testPerimetroTriangulo() {
        assertEquals(7, cp.visitaTriangulo(tr), 0.1);
    }
}