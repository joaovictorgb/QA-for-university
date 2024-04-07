package entities;

import funcoes.Funcao;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private Funcionario diretor;
    private Funcionario roteirista;
    private List<Funcionario> elenco;

    public Filme(String nome, Funcionario diretor, Funcionario roteirista) throws ExcecaoFilme {
        if (nome == null || nome.isEmpty()) {
            throw new ExcecaoFilme("Nome inválido para filme.");
        }
        if (diretor == null || roteirista == null) {
            throw new ExcecaoFilme("Diretor ou roteirista não podem ser nulos.");
        }
        this.nome = nome;
        this.diretor = diretor;
        this.roteirista = roteirista;
        this.elenco = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (funcionario != null) {
            elenco.add(funcionario);
        }
    }

    public String getNome() {
        return nome;
    }

    public Funcionario getDiretor() {
        return diretor;
    }

    public Funcionario getRoteirista() {
        return roteirista;
    }

    public List<Funcionario> getElenco() {
        return elenco;
    }
}
