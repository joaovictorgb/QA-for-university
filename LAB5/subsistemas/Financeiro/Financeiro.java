package Financeiro;

import java.util.ArrayList;

public class Financeiro {
    ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    ArrayList<Conta> contas = new ArrayList<Conta>();

    public Financeiro() {
        // gerar pagamentos fictícios
        for (int i = 0; i < 5; i++) {
            Pagamento pagamento = new Pagamento();
            this.pagamentos.add(pagamento);
        }

        // gerar contas fictícias
        for (int i = 0; i < 5; i++) {
            Conta conta = new Conta();
            this.contas.add(conta);
        }
    }

    public String obterBalancoContas() {
        double receitas = 0;
        double despesas = 0;

        for (Conta conta : this.contas) {
            receitas += conta.getSaldo();
        }

        for (Pagamento pagamento : this.pagamentos) {
            despesas += pagamento.getSalario();
        }

        return "\n-> Balanço de contas em 30/09/2023: \nReceitas: R$" + receitas + " \nDespesas: R$" + despesas + ".";
    }

    public String obterFolhaPagamento() {
        String folhaPagamento = "\n\n-> Folha de pagamento de outubro de 2023\n";

        for (Pagamento pagamento : this.pagamentos) {
            folhaPagamento += pagamento.getFuncionarioNome() + ": R$" + pagamento.getSalario() + "\n";
        }

        return folhaPagamento;
    }
}
