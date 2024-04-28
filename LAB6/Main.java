import Entities.GeometricShapeFactory;

public class Main {
    public static void main(String[] args) {
        GeometricShapeFactory factory = new GeometricShapeFactory();


        System.out.println(factory.createCircle());
        System.out.println(factory.createSquare());
        System.out.println(factory.createSquare());

        System.out.println(factory.createEquilateralTriangle());
        System.out.println(factory.createIsoscelesTriangle());
        System.out.println(factory.createRectangleTriangle());
    }
}