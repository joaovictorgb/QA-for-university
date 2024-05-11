package visitors;

import entidades.*;

public class Main {

	public static void main(String[] args) {
		
		VisitorIF visitorCA = new VisitorCalculaArea();
		VisitorIF visitorCP = new VisitorCalculaPerimetro();
		VisitorIF visitorDes = new VisitorDesenhar();
		VisitorIF visitorMax = new VisitorMaximizarFigura();
		
		Circulo circulo = new Circulo(4);
		Retangulo retangulo = new Retangulo(5,7);
		Trapezio trapezio = new Trapezio(5,10,4,6,6);
		Triangulo triangulo = new Triangulo(12,8,10,10);
		
		System.out.println("Área do círculo: " + visitorCA.visitaCirculo(circulo));
		System.out.println("Área do Trapezio: " + visitorCA.visitaTrapezio(trapezio));
		System.out.println("Área do Triangulo: " + visitorCA.visitaTriangulo(triangulo));
		System.out.println("Área do Retangulo: " + visitorCA.visitaRetangulo(retangulo));
		
		
		System.out.println("Perímetro do círculo: " + visitorCP.visitaCirculo(circulo));
		System.out.println("Perímetro do Trapezio: " + visitorCP.visitaTrapezio(trapezio));
		System.out.println("Perímetro do Triangulo: " + visitorCP.visitaTriangulo(triangulo));
		System.out.println("Perímetro do Retangulo: " + visitorCP.visitaRetangulo(retangulo));
		
		visitorDes.visitaCirculo(circulo);
		visitorDes.visitaTrapezio(trapezio);
		visitorDes.visitaTriangulo(triangulo);
		visitorDes.visitaRetangulo(retangulo);
		
		visitorMax.visitaCirculo(circulo);
		System.out.println("Raio do Circulo após ser maximizado: " + circulo.getRaio());
		visitorMax.visitaRetangulo(retangulo);
		System.out.println("Largura e Altura do retangulo após ser maximizado: " + retangulo.getLargura() + " | " + retangulo.getAltura());
	
		
	}
	
}
