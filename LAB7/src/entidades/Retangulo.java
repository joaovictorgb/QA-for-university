package entidades;

import visitors.VisitorIF;

public class Retangulo implements ElementoConcretoIF {
	
	private int largura;
	private int altura;
	
	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public void aceitaVisita(VisitorIF v) {
		v.visitaRetangulo(this);
	}
	
	public int getLargura() {
		return largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
}
