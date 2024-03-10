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
    
    public void removerDisciplina(Disciplina disciplina) {
        if (this.obterDisciplinasMinistradas().contains(disciplina)) 
        	this.obterDisciplinasMinistradas().remove(disciplina);
        else System.out.println(this.getNome() + " não leciona nesta disciplina.");
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