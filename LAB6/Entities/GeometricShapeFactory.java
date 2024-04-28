package Entities;

public class GeometricShapeFactory {    
    public GeometricShapeFactory() {}
    
    public Circle createCircle() {
        return new Circle();
    }
    
    public Triangle createIsoscelesTriangle() {
        return new Triangle("Isosceles");
    }
    
    public Triangle createEquilateralTriangle() {
        return new Triangle("Equilatero");
    }
    
    public Triangle createRectangleTriangle() {
        return new Triangle("Retangulo");
    }
    
    public Square createSquare() {
        return new Square();
    }
}