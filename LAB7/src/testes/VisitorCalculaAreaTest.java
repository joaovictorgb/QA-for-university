package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import entidades.*;
import visitors.*;

public class VisitorCalculaAreaTest {
    VisitorIF ca;
    Retangulo r;
    Circulo c;
    Trapezio t;
    Triangulo tr;

    @Before
    public void setup() throws ExcecaoEntidade {
        ca = new VisitorCalculaArea();
        r = new Retangulo(2, 4);
        c = new Circulo(2);
        t = new Trapezio(2, 4, 3, 2, 2);
        tr = new Triangulo(3, 4, 2, 2);
    }

    @Test
    public void testAreaRetangulo() {
        assertEquals(8, ca.visitaRetangulo(r), 0.1);
    }

    @Test
    public void testAreaCirculo() {
        assertEquals(12.56, ca.visitaCirculo(c), 0.01);
    }

    @Test
    public void testAreaTrapezio() {
        assertEquals(9.0, ca.visitaTrapezio(t), 0.1);
    }

    @Test
    public void testAreaTriangulo() {
        assertEquals(6.0, ca.visitaTriangulo(tr), 0.1);
    }
}
