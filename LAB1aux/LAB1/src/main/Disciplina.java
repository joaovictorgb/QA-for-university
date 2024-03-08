package main;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String codigo;
    private int cargaHoraria;
    private List<Aluno> alunosMatriculados;
    private String horário;
    private Professor professor;

    public Disciplina(String nome, String codigo, int cargaHoraria, String horario) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.horário = horario;
        this.alunosMatriculados = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    public List<Aluno> obterAlunosMatriculados() {
        return alunosMatriculados;
    }

    public int numeroDeAlunos() {
        return alunosMatriculados.size();
    }
    
    
    public void dadosDisciplina() {
    	System.out.println();
    	System.out.println("Nome: " + this.nome);
    	System.out.println("Código " + this.codigo);
    	System.out.println("CH: " + this.cargaHoraria);
    	System.out.println("Horário: "+ this.horário);
    	System.out.println("Número de Alunos na disciplina: " + this.numeroDeAlunos());
		System.out.println("Alunos matriculados:\n");
        List<Aluno> alunos = this.obterAlunosMatriculados();
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome() + " (" + aluno.getMatricula() + ")");
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getHorário() {
		return horário;
	}

	public void setHorário(String horário) {
		this.horário = horário;
	}
}
