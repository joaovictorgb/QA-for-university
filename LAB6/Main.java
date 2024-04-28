import Entities.ExcecaoInstancia;
import Entities.Factory;

public class Main {
    public static void main(String[] args) throws ExcecaoInstancia {

        System.out.println(Factory.createCircle(5));
        System.out.println(Factory.createSquare(4));
        System.out.println(Factory.createSquare(3));

        System.out.println(Factory.createEquilateralTriangle());
        System.out.println(Factory.createIsoscelesTriangle());
        System.out.println(Factory.createRectangleTriangle());
    }
}