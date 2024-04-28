package Entities;

class Circle {
    private static Circle instance;
    
    public Circle() {
        if (Circle.instance == null) {
            Circle.instance = this;
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public String toString() {
        return "Círculo criado";
    }
}