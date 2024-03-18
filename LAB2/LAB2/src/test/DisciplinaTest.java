package test;

import org.junit.jupiter.api.Test;
import main.Disciplina;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class DisciplinaTest {

	private Disciplina disciplina;

	
	@BeforeEach
	public void setup() {
        disciplina = new Disciplina("Algoritmos", "ALG123", 60);
	}

    @Test
    public void testGetterSetter(){
        disciplina.setCargaHoraria(30);;
        assertEquals(disciplina.getCargaHoraria(), 30 );
    }

    @Test
    public void testConstrutor(){
        assertEquals(disciplina.getNome(), "Algoritmos");
        assertEquals(disciplina.getCodigo(), "ALG123");
        assertEquals(disciplina.getCargaHoraria(),60);
    }
    
}