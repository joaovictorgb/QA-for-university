package entities;

import exceptions.FiguraException;
import interfaces.FigurasInterface;

public class Quadrado implements FigurasInterface {
    private double lado;

    public Quadrado(double lado) throws FiguraException {
        if (lado <= 0) {
            throw new FiguraException("Lado do quadrado não pode ser negativo ou zero.");
        }
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public Double calcularPerimetro() {
        return 4 * this.lado;
    }

    @Override
    public String toString() {
        return "Quadrado de lado " + lado;
    }
}
