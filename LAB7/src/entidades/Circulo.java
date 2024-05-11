package entidades;

import visitors.VisitorIF;

public class Circulo implements ElementoConcretoIF {
	
	private double raio;
	
	public Circulo(double r) {
		this.raio = r;
	}
	
	public void aceitaVisita(VisitorIF v) {
		v.visitaCirculo(this);
	}
	
	public double getRaio() {
		return this.raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
}