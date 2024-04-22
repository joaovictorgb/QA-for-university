package Professores;

import java.util.Random;

public class ProfessorDados {
    private String professorNome;
    private String disciplinaNome;
    private int tempoDeCasa;

    public ProfessorDados() {
        this.professorNome = gerarNomeProfessor();
        this.disciplinaNome = gerarNomeDisciplina();
        this.tempoDeCasa = gerarTempoDeCasa();
    }

    private String gerarNomeProfessor() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int indice = random.nextInt(letras.length());
            char letra = letras.charAt(indice);
            resultado.append(letra);
        }

        return resultado.toString();
    }

    private String gerarNomeDisciplina() {
        String[] disciplinas = { "Matemática", "Português", "História", "Geografia", "Física", "Química", "Biologia",
                "Inglês", "Educação Física" };
        Random random = new Random();
        int indice = random.nextInt(disciplinas.length);

        return disciplinas[indice];
    }

    private int gerarTempoDeCasa() {
        Random random = new Random();
        int tempo = random.nextInt(15);

        return tempo;
    }

    public String getProfessorNome() {
        return this.professorNome;
    }

    public String getDisciplinaNome() {
        return this.disciplinaNome;
    }

    public int getTempoDeCasa() {
        return this.tempoDeCasa;
    }
}
