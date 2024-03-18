package main;

public class Main {
	public static void main(String[] args) throws Exception {
		ControleAcademico CA = new ControleAcademico();
		CA.adicionarDisciplina("Algoritmos", "ALG123", 60);
		CA.adicionarDisciplina("Matemática Discreta", "MAT123", 60);
		CA.adicionarDisciplina("Métodos Avançados de Programação", "MAP123", 60);
		
		CA.dadosDisciplinas();
		CA.adicionarTurma("MAT123", "B104", "Segunda 14h-16h" );
		CA.adicionarTurma("ALG123", "LABV", "Terça 16h-18h");
		CA.adicionarAlunos(1, "Joao", "2024124");
		CA.adicionarAlunos(1, "Maria", "1234567");
		CA.adicionarProfessor(1, "Julia", "2313213");
		CA.adicionarProfessor(2, "Pedro", "55555");
		CA.adicionarAlunos(2,"Andre", "4242424");
		CA.dadosTurmas();
	}
}