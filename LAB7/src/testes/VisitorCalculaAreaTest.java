package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import entidades.*;
import visitors.*;

public class VisitorCalculaAreaTest {
	
	VisitorIF ca;
 	Retangulo r;

	@Before
	public void setup() {
		ca = new VisitorCalculaArea();
		r = new Retangulo(2,4);
		
	}
	
	
	@Test
	public void testAreaRetangulo() {
		assertEquals(8, ca.visitaRetangulo(r), 0.1);
	}
}
