package Entities;

public class Factory {    
    
    public static Circle createCircle(int raio) throws ExcecaoInstancia {
        return Circle.getInstance(raio);
    }
    
    public static Triangle createIsoscelesTriangle() throws ExcecaoInstancia {
        return Triangle.getInstance("Isosceles");
    }
    
    public static Triangle createEquilateralTriangle() throws ExcecaoInstancia {
        return Triangle.getInstance("Equilatero");
    }
    
    public static Triangle createRectangleTriangle() throws ExcecaoInstancia {
        return Triangle.getInstance("Retangulo");
    }
    
    public static Square createSquare(int lado) throws ExcecaoInstancia {
        return Square.getInstance(lado);
    }
}