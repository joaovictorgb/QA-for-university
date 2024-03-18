
package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Aluno;


class AlunoTest {
	
	private Aluno aluno1;
	
	@BeforeEach
    public void setup() {
        aluno1 = new Aluno("Paulo Silva", "221012312");
    }	

    @Test
    public void testGetterSetter(){
        assertEquals(aluno1.getMatricula(),"221012312" );
        aluno1.setMatricula("2221012313");
        assertEquals(aluno1.getMatricula(),"2221012313" );
    }

    @Test
    public void testConstrutor(){
        assertEquals(aluno1.getNome(), "Paulo Silva");
        assertEquals(aluno1.getMatricula(), "221012312");
    }

}