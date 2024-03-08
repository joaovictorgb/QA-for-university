package main;
import java.util.Scanner;

public class ControleAcademico {
	    public static void main(String[] args) {
	        // Criando professores
	        Professor professor1 = new Professor("João Silva");
	        Professor professor2 = new Professor("Maria Santos");
	        Professor professor3 = new Professor("Caio Ribeiro");
	        // Criando disciplinas
	        Disciplina matematica = new Disciplina("Matemática Discreta", "MAT123", 60, "Segunda 11h-13 | Quarta 9h-11h");
	        Disciplina algoritmos = new Disciplina("Algoritmos e Estruturas de Dados", "ALG456", 90, "Terça 07h-09h | Quarta 07-09h");
	        Disciplina bancoDeDados = new Disciplina("Banco de Dados", "MAP678", 60, "Quinta 09h-11h | Sexta 11h-13h");
	        // Associando professores às disciplinas
	        professor1.adicionarDisciplina(matematica);
	        professor2.adicionarDisciplina(algoritmos);
	        professor3.adicionarDisciplina(bancoDeDados);
	        // Criando alunos
	        Aluno aluno1 = new Aluno("Pedro Henrique", "20210001");
	        Aluno aluno2 = new Aluno("Ana Carolina", "20210002");
	        Aluno aluno3 = new Aluno("Maria Eduarda", "20220003");
	        
	        // Associando alunos às disciplinas
	        aluno1.matricularDisciplina(bancoDeDados);
	        aluno1.matricularDisciplina(algoritmos);
	        aluno2.matricularDisciplina(matematica);
	        aluno2.matricularDisciplina(algoritmos);
	        aluno3.matricularDisciplina(matematica);
	        aluno3.matricularDisciplina(bancoDeDados);
	        
	        
	        Scanner entrada= new Scanner(System.in);
	        Scanner scanner = new Scanner(System.in);
	        int escolha = 1;
	        
	        //Loop do menu principal
	        while(escolha!=0) {
	        	mostrarMenu();
	        	escolha = entrada.nextInt();
	        	switch (escolha) {
	        		case 1: 
	        			System.out.println("Professores cadastrados: \n");
	        			professor1.dadosProfessor();
	        			professor2.dadosProfessor();
	        			professor3.dadosProfessor();
	        			System.out.println("Pressione Enter para voltar");
	        	        scanner.nextLine(); 
	        			break;
	        		case 2: 
	        			System.out.println("Alunos cadastrados: \n");
	        			aluno1.dadosAlunos();
	        			aluno2.dadosAlunos();
	        			aluno3.dadosAlunos();
	        			System.out.println("Pressione enter para voltar");
	        	        scanner.nextLine(); 
	        			break;

	        		case 3: 
	        			System.out.println("Disciplinas cadastradas");
	        			matematica.dadosDisciplina();
	        			bancoDeDados.dadosDisciplina();
	        			algoritmos.dadosDisciplina();
	        			System.out.println("\nPressione enter para voltar");
	        	        scanner.nextLine(); 
	        			break;
	        		case 0: break;
	        		default: 
	        			System.out.println("Escolha uma opção válida. \n");
	        			break;
	        	}
	        }
	        scanner.close();
	        entrada.close();
	    }    
	    
	    public static void mostrarMenu() {
			System.out.println("Bem vindo ao controle acadêmico!");
			System.out.println("Escolha as informações que deseja ver");
			System.out.println("1 - Professores");
			System.out.println("2 - Alunos");
			System.out.println("3 - Disciplinas");
			System.out.println("0 - Sair");
	    }
	    
}
