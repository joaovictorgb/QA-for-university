package test;

import org.junit.jupiter.api.Test;

import main.Aluno;
import main.Disciplina;
import main.Professor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class ProfessorTest {
	
	private Professor professor;
	
	@BeforeEach
    public void setup() {
        professor = new Professor("Rafael Costa", "123123");
    }	

    @Test
    public void testGetterSetter(){
        professor.setId("123124");;
        assertEquals(professor.getId(),"123124" );
    }

    @Test
    public void testConstrutor(){
        assertEquals(professor.getNome(), "Paulo Silva");
        assertEquals(professor.getId(), "123123");
    }

}

