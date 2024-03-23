package app;

import entities.FigurasGeometricas;
import exceptions.FiguraException;

public class BrincandoComAsFigurasGeometricas {

    public static void main(String[] args) {
        try {
            FigurasGeometricas fig = new FigurasGeometricas(10, 5, 7, 25);

            System.out.println(fig.getTodosPerimetros());
            System.out.println(fig.areaDaFigura(FigurasGeometricas.R));
            System.out.println(fig.areaDaFigura(-1)); // Testar com valor inválido
            System.out.println(fig.areaDaFigura(2));
            System.out.println(fig.areaDaFigura(1));

            System.out.println("Figura 1: " + fig.toStringDaFigura(1));
            System.out.println("Figura 0: " + fig.toStringDaFigura(0));
            System.out.println("Figura -1: " + fig.toStringDaFigura(-1));
            System.out.println("Figura 2: \n" + fig.toStringDaFigura(2));
        } catch (FiguraException e) {
            System.out.println("Erro ao criar figura: " + e.getMessage());
        }
    }
}
