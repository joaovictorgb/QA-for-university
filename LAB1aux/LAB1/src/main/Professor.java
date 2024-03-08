package main;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Disciplina> disciplinasMinistradas;

    public Professor(String nome) {
        this.nome = nome;
        this.disciplinasMinistradas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinasMinistradas.add(disciplina);
    }

    public List<Disciplina> obterDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    
    public void dadosProfessor() {
    	System.out.println("Nome: " + this.nome);
		System.out.println("Disciplinas ministradas:");
        List<Disciplina> disciplinas = this.obterDisciplinasMinistradas();
        for (Disciplina disciplina : disciplinas) {
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

    public List<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(List<Disciplina> disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

}