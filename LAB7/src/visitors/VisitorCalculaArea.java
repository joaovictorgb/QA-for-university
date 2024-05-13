package visitors;

import entidades.*;

public class VisitorCalculaArea implements VisitorIF {

	public double visitaRetangulo(Retangulo r){
	return r.getAltura() * r.getLargura();
	}
	
	public double visitaTriangulo (Triangulo t) {
	return (t.getBase() * t.getAltura())/2;
	}
	public double visitaCirculo (Circulo c){
		return 3.14 * Math.pow(c.getRaio() , 2); 
	}
	
	public double visitaTrapezio (Trapezio t) {
		return ( ( t.getBaseMaior() + t.getBaseMenor() ) * t.getAltura() ) /2;
	}
	
}