package Entities;

public class Circle {

    private static Circle instance;
    private int raio;

    private Circle(int raio){
        this.raio=raio;
    }

    public static Circle getInstance(int raio) throws ExcecaoInstancia {
        if (raio<1) throw new ExcecaoInstancia("Raio inválido");

        if (instance == null) {
            instance = new Circle(raio);
            return instance;
            
        } else {
            throw new ExcecaoInstancia("Já existe uma instância de Círculo");
        }
    }

    public int getRaio() {
        return raio;
    }

    @Override
    public String toString() {
        return "Círculo criado de raio: " + raio;
    }
}