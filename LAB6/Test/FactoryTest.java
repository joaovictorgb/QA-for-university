package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.BeforeClass;
import org.junit.Test;

import Entities.*;

public class FactoryTest {

    private static Circle circulo = null;
    private static Square quadrado = null;
    

    @BeforeClass
    public static void setUp() throws ExcecaoInstancia {
        circulo = Factory.createCircle(5);
        quadrado = Factory.createSquare(4);
    }

    @Test 
    public void testCriarCirculo() throws ExcecaoInstancia{
        assertEquals(5, circulo.getRaio());
    }

    @Test
    public void testCriarDoisCirculos() throws ExcecaoInstancia {
        assertThrows(ExcecaoInstancia.class, () -> Factory.createCircle(5));
    }


    @Test
    public void testCriarDoisTriangulosRetangulos() throws ExcecaoInstancia {
        Factory.createRectangleTriangle();
        assertThrows(ExcecaoInstancia.class, () -> Factory.createRectangleTriangle());
    }


   @Test
    public void testCriarDoisTriangulosIsosceles() throws ExcecaoInstancia {
        Factory.createIsoscelesTriangle();
        assertThrows(ExcecaoInstancia.class, () -> Factory.createIsoscelesTriangle());
    }


    @Test
    public void testCriarDoisTriangulosEquilateros() throws ExcecaoInstancia {
        Factory.createEquilateralTriangle();
        assertThrows(ExcecaoInstancia.class, () -> Factory.createEquilateralTriangle());
    }


    @Test
    public void testeCriarQuadrado(){
        assertEquals(4, quadrado.getLado());
    }

    @Test 
    public void testeCriarDoisQuadrados() throws ExcecaoInstancia{
        Square novoQuadrado = Factory.createSquare(6);
        assertEquals(6, novoQuadrado.getLado() );
    }
   
}
