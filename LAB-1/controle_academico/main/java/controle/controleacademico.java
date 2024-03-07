import entidades.Aluno;
import entidades.Disciplina;
import entidades.Professor;

import java.util.List;

public class ControleAcademico {
    public static void main(String[] args) {
        // Criando professores
        Professor professor1 = new Professor("João Silva", "Segunda 8h-10h");
        Professor professor2 = new Professor("Maria Santos", "Terça 14h-16h");

        // Criando disciplinas
        Disciplina matematica = new Disciplina("Matemática Discreta", "MAT123", 60);
        Disciplina algoritmos = new Disciplina("Algoritmos e Estruturas de Dados", "ALG456", 90);

        // Associando professores às disciplinas
        professor1.adicionarDisciplina(matematica);
        professor2.adicionarDisciplina(algoritmos);

        // Criando alunos
        Aluno aluno1 = new Aluno("Pedro Henrique", "20210001");
        Aluno aluno2 = new Aluno("Ana Carolina", "20210002");

        // Associando alunos às disciplinas
        matematica.adicionarAluno(aluno1);
        algoritmos.adicionarAluno(aluno2);

        // Testando métodos
        System.out.println("Disciplinas do Professor João Silva:");
        List<Disciplina> disciplinasJoao = professor1.obterDisciplinasMinistradas();
        for (Disciplina disciplina : disciplinasJoao) {
            System.out.println("- " + disciplina.getNome() + " (" + disciplina.getCodigo() + ")");
        }

        System.out.println("\nAlunos matriculados em Matemática Discreta:");
        List<Aluno> alunosMatematica = matematica.obterAlunosMatriculados();
        for (Aluno aluno : alunosMatematica) {
            System.out.println("- " + aluno.getNome() + " (" + aluno.getMatricula() + ")");
        }

        System.out.println("\nNúmero de alunos em Algoritmos e Estruturas de Dados: " + algoritmos.numeroDeAlunos());
    }
}
