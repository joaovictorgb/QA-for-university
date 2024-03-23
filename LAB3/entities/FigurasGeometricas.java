package entities;

import exceptions.FiguraException;

public class FigurasGeometricas {
    public static final int R = -1;
    public static final int Q = 0;
    public static final int C = 1;
    public static final int T = 2;

    private Retangulo retangulo;
    private Quadrado quadrado;
    private Circulo circulo;

    public FigurasGeometricas(double alturaQuadrado, double larguraQuadrado, double comprimentoLadoQuadrado,
                              double raioCirculo) throws FiguraException {
        this.retangulo = new Retangulo(alturaQuadrado, larguraQuadrado);
        this.quadrado = new Quadrado(comprimentoLadoQuadrado);
        this.circulo = new Circulo(raioCirculo);
    }

    public String areaDaFigura(int tipoDaFigura) throws FiguraException {
        switch (tipoDaFigura) {
            case R:
                return this.retangulo.calcularArea().toString();

            case Q:
                return this.quadrado.calcularArea().toString();

            case C:
                return this.circulo.calcularArea().toString();

            case T:
                return this.getTodosAreas();

            default:
                throw new FiguraException();
        }
    }

    public String toStringDaFigura(int tipoDaFigura) throws FiguraException {
        switch (tipoDaFigura) {
            case R:
                return retangulo.toString();
            case Q:
                return quadrado.toString();

            case C:
                return circulo.toString();

            case T:
                return this.getTodasFiguras();
            default:
                throw new FiguraException();
        }
    }

    public String PerimetroDaFigura(int tipoDaFigura) throws FiguraException {
        switch (tipoDaFigura) {
            case R:
                return this.retangulo.calcularPerimetro().toString();

            case Q:
                return this.quadrado.calcularPerimetro().toString();

            case C:
                return this.circulo.calcularPerimetro().toString();

            case T:
                return this.getTodosPerimetros();

            default:
                throw new FiguraException();

        }
    }

    public String getTodosAreas() {
        return "Retangulo: " + retangulo.calcularArea() + "\n" +
                "Quadrado: " + quadrado.calcularArea() + "\n" +
                "Circulo: " + circulo.calcularArea() + "\n";

    }

    public String getTodosPerimetros() {
        return "Retangulo: " + retangulo.calcularPerimetro() + "\n" +
                "Quadrado: " + quadrado.calcularPerimetro() + "\n" +
                "Circulo: " + circulo.calcularPerimetro() + "\n";

    }

    public String getTodasFiguras() {
        return retangulo.toString() + "\n" +
                quadrado.toString() + "\n" +
                circulo.toString() + "\n";

    }
}
