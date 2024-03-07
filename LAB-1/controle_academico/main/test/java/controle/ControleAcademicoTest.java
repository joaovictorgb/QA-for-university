
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControleAcademicoTest {

    @Test
    void main() {
        // Redirecionando a saída do console
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Executando o main
        String[] args = {};
        ControleAcademico.main(args);

        // Verificando a saída
        String expectedOutput = "Disciplinas do Professor João Silva:\n" +
                "- Matemática Discreta (MAT123)\n" +
                "- Algoritmos e Estruturas de Dados (ALG456)\n" +
                "\n" +
                "Alunos matriculados em Matemática Discreta:\n" +
                "- Pedro Henrique (20210001)\n" +
                "\n" +
                "Número de alunos em Algoritmos e Estruturas de Dados: 1\n";
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}
