package Alunos;

public class Alunos {
    private String nome;
    private int matricula;
    private Historico historico;
    private RDM rdm;

    public Alunos(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.historico = new Historico();
        this.rdm = new RDM();
    }

    public void adicionarDisciplinaConcluida(String disciplina) {
        historico.adicionarDisciplinaConcluida(disciplina);
    }

    public void adicionarNota(String disciplina, double nota) {
        rdm.adicionarNota(disciplina, nota);
    }

    public String obterHistorico() {
        String historicoAluno = "Histórico do Aluno: " + nome + "\n";
        historicoAluno += historico.obterHistorico(); // Supondo que o método obterHistorico retorne uma String.
    
        return historicoAluno;
    }
    
    public String obterRDM() {
        String rdmAluno = "Rendimento Acadêmico do Aluno: " + nome + "\n";
        rdmAluno += "RDM: " + rdm.calcularRDM() + "\n";
    
        return rdmAluno;
    }
    
}
