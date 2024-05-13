package entidades;

import visitors.VisitorIF;

public class Circulo implements ElementoConcretoIF {
	
	private double raio;
	
	public Circulo(double r) throws ExcecaoEntidade {
		if (r<1) throw new ExcecaoEntidade("Raio inválido");
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