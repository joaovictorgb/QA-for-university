package entities;

import exceptions.ExcecaoPessoa;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) throws ExcecaoPessoa {
        if (nome == null || nome.isEmpty()) {
            throw new ExcecaoPessoa("Nome inválido para pessoa.");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
