package entidades;

import visitors.VisitorIF;

public class Triangulo {
	
	private int base;
	private int altura;
	private int lado1;
	private int lado2;
	
	public Triangulo(int base, int altura, int lado1, int lado2) {
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public void aceitaVisita(VisitorIF v) {
		v.visitaTriangulo(this);
	}

	public int getLado1() {
		return lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	
}
