package main;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private List<Disciplina> disciplinasMatriculadas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public void matricularDisciplina(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
        disciplina.adicionarAluno(this);
    }

    public List<Disciplina> obterDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void dadosAlunos() {
    	System.out.println("Nome: " + this.nome);
    	System.out.println("Matrícula: " + this.matricula);
		System.out.println("Disciplinas atendidas:");
        for (Disciplina disciplina : disciplinasMatriculadas) {
        	System.out.println();
            System.out.println("- " + disciplina.getNome() + " (" + disciplina.getCodigo() + ")\n" + disciplina.getHorário());
            System.out.println();
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(List<Disciplina> disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }
}