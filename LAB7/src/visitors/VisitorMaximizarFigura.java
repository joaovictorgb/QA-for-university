package visitors;

import entidades.*;

public class VisitorMaximizarFigura implements VisitorIF {

	public double visitaRetangulo(Retangulo r) {
		r.setAltura(r.getAltura()*2);
		r.setLargura(r.getLargura()*2);
		return 0;
	}

	public double visitaTriangulo(Triangulo t) {
		t.setAltura(t.getAltura()*2);
		t.setBase(t.getBase()*2);
		t.setLado1(t.getLado1()*2);
		t.setLado2(t.getLado2()*2);
		return 0;
	}

	public double visitaCirculo(Circulo c) {
		c.setRaio(c.getRaio()*2);
		return 0;
	}

	public double visitaTrapezio(Trapezio tz) {
		tz.setAltura(tz.getAltura()*2);
		tz.setBaseMaior(tz.getBaseMaior()*2);
		tz.setBaseMenor(tz.getBaseMenor()*2);
		tz.setLado1(tz.getLado1()*2);
		tz.setLado2(tz.getLado2()*2);
		return 0;
	}

}
