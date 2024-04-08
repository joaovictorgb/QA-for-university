package entities;

import exceptions.ExcecaoFilme;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private Funcionario diretor;
    private Funcionario roteirista;
    private List<Funcionario> elenco;

    public Filme(String nome, Funcionario diretor, Funcionario roteirista) throws ExcecaoFilme {
        if (nome == null || nome.isEmpty()) {
            throw new ExcecaoFilme("Nome inválido para o filme.");
        }
        if (diretor == null || roteirista == null) {
            throw new ExcecaoFilme("Diretor ou roteirista não podem ser nulos.");
        }
        this.nome = nome;
        this.diretor = diretor;
        this.roteirista = roteirista;
        this.elenco = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) throws ExcecaoFilme {
        if (funcionario == null) {
            throw new ExcecaoFilme("Funcionário não pode ser nulo.");
        }
        if (elenco.contains(funcionario)) {
            throw new ExcecaoFilme("Funcionário já está no elenco.");
        }
        elenco.add(funcionario);
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

    public String getElencoAsString() {
        StringBuilder sb = new StringBuilder();
        for (Funcionario funcionario : elenco) {
            sb.append(funcionario.getNome()).append(" (").append(funcionario.getFuncoesAsString()).append("), ");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2); 
        }
        return sb.toString();
    }
}
