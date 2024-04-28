package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;
import Entities.GeometricShapeFactory;

public class GeometricShapeFactoryTest {
    private GeometricShapeFactory factory;

   

    @Test
    public void testCreateCircle() throws RuntimeException {
        GeometricShapeFactory anotherFactory = new GeometricShapeFactory();
        anotherFactory.createCircle();
        assertThrows(RuntimeException.class, () -> anotherFactory.createCircle());
    }

   

    @Test
    public void testCreateRectangleTriangle() throws RuntimeException {
        GeometricShapeFactory anotherFactory = new GeometricShapeFactory();
        anotherFactory.createRectangleTriangle();
        assertThrows(RuntimeException.class, () -> anotherFactory.createRectangleTriangle());
    }


   @Test
    public void createIsoscelesTriangle() throws RuntimeException {
        GeometricShapeFactory anotherFactory = new GeometricShapeFactory();
        anotherFactory.createIsoscelesTriangle();
        assertThrows(RuntimeException.class, () -> anotherFactory.createIsoscelesTriangle());
    }


    @Test
    public void createEquilateralTriangle() throws RuntimeException {
        GeometricShapeFactory anotherFactory = new GeometricShapeFactory();
        anotherFactory.createEquilateralTriangle();
         assertThrows(RuntimeException.class, () -> anotherFactory.createEquilateralTriangle());
    }


   
}
