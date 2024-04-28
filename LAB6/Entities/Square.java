package Entities;


public class Square {
    private int lado;

    private Square(int lado) {
        this.lado=lado;
    }

    public static Square getInstance(int lado) throws ExcecaoInstancia {
        if (lado<1) throw new ExcecaoInstancia("Lado inválido");
        else return new Square(lado);  
    }

    public int getLado() {
        return lado;
    }

    
    @Override
    public String toString() {
        return "Quadrado criado de lado: " + lado;
    }
}