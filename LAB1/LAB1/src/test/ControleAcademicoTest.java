package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.ControleAcademico;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControleAcademicoTest {

    private ByteArrayOutputStream outputStreamCaptor;

    @BeforeEach
    void setup() {
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testMostrarMenu() {
        ControleAcademico.mostrarMenu(); 
        String menuEsperado = "Bem vindo ao controle acadêmico!\n" +
                              "Escolha as informações que deseja ver\n" +
                              "1 - Professores\n" +
                              "2 - Alunos\n" +
                              "3 - Disciplinas\n" +
                              "0 - Sair\n";
        assertEquals(menuEsperado, outputStreamCaptor.toString());
    }
    
    
}

