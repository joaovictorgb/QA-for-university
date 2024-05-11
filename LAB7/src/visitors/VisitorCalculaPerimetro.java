package visitors;

import entidades.*;

public class VisitorCalculaPerimetro implements VisitorIF {
	
	public double visitaRetangulo(Retangulo r){
		return (r.getAltura() * 2 ) + ( r.getLargura() * 2 );
	}
		
	public double visitaTriangulo (Triangulo t) {
		return (t.getBase() + t.getLado1() + t.getLado2());
	}
	
	public double visitaCirculo (Circulo c){
		return (2 * 3.14 * c.getRaio());
	}
		
	public double visitaTrapezio (Trapezio tz) {
		return (tz.getBaseMenor() + tz.getBaseMaior() + tz.getLado1() + tz.getLado2());
	}
	
}
