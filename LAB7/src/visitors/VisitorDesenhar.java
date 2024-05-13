package visitors;

import entidades.*;

public class VisitorDesenhar implements VisitorIF {

	public double visitaRetangulo(Retangulo r) {
		System.out.println("Retângulo desenhado");
		return 0;
	}

	public double visitaTriangulo(Triangulo t) {
		System.out.println("Triângulo desenhado");
		return 0;
	}

	public double visitaCirculo(Circulo c) {
		System.out.println("Círculo desenhado");
		return 0;
	}

	public double visitaTrapezio(Trapezio tz) {
		System.out.println("Trapezio desenhado");
		return 0;
	}

}
