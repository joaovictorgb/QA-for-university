package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import entidades.*;
import visitors.*;

public class VisitorCalculaAreaTest {
	
	VisitorIF ca;
 	Retangulo r;
	Circulo c;

	@Before
	public void setup() {
		ca = new VisitorCalculaArea();
		r = new Retangulo(2,4);
		c = new Circulo(2);
	}
	
	
	@Test
	public void testAreaRetangulo() {
		assertEquals(8, ca.visitaRetangulo(r), 0.1);
	}

	@Test
	public void testAreaCirculo(){
		assertEquals(12.58 , ca.visitaCirculo(c), 0.1);
	}
}
