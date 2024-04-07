import entities.*;


import java.util.List;

public class ControleAcesso {
    public static void main(String[] args) {
        try {
            // Criação de funcionários
            Funcionario pessoa1 = new Funcionario("Pessoa 1");
            Funcionario pessoa2 = new Funcionario("Pessoa 2");

            // Adiciona funções aos funcionários
            pessoa1.adicionarFuncao(new Ator());
            pessoa1.adicionarFuncao(new Cameraman());
            pessoa2.adicionarFuncao(new Diretor());
            pessoa2.adicionarFuncao(new Roteirista());
            pessoa2.adicionarFuncao(new Ator());

            // Criação de um filme
            Funcionario diretorFilme = new Funcionario("Diretor 1");
            diretorFilme.adicionarFuncao(new Diretor());
            Funcionario roteiristaFilme = new Funcionario("Roteirista 1");
            roteiristaFilme.adicionarFuncao(new Roteirista());

            Filme filme1 = new Filme("Filme 1", diretorFilme, roteiristaFilme);

            
            filme1.adicionarFuncionario(pessoa1);
            filme1.adicionarFuncionario(pessoa2);

            
            System.out.println("Nome do Filme: " + filme1.getNome());
            System.out.println("Diretor: " + filme1.getDiretor().getNome());
            System.out.println("Roteirista: " + filme1.getRoteirista().getNome());
            System.out.println("Elenco:");

            for (Funcionario funcionario : filme1.getElenco()) {
                System.out.print(funcionario.getNome() + " - Funções: ");
                List<Funcao> funcoes = funcionario.getFuncoes();
                for (int i = 0; i < funcoes.size(); i++) {
                    System.out.print(funcoes.get(i).getFuncao());
                    if (i < funcoes.size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }

        } catch (ExcecaoPessoa | ExcecaoFilme e) {
            System.out.println("Erro ao criar pessoa ou filme: " + e.getMessage());
        }
    }
}
