package main;
import Administrativa.Administrativa;
import Financeiro.Financeiro;
import Professores.Professores;
import Alunos.Alunos;
import Almoxarifado.Almoxarifado;
import Infraestrutura.Infraestrutura;

public class SIG {
    public Administrativa administrativo;
    public Financeiro financeiro;
    public Professores professores;
    public Alunos alunos;
    public Almoxarifado almoxarifado;
    public Infraestrutura infraestrutura;

    public SIG() {
        administrativo = new Administrativa();
        financeiro = new Financeiro();
        professores = new Professores();
        alunos = new Alunos("Nome1", 12345);
        almoxarifado = new Almoxarifado();
        infraestrutura = new Infraestrutura();
    }

    public String obterInformacoesAdministrativas() {
        String formatarSaida = "\n------| Informações Administrativas |-------\n";
        formatarSaida += administrativo.obterReunioesAgendadas();
        formatarSaida += administrativo.obterEntrevistas();

        return formatarSaida;
    }

    public String obterInformacoesFinanceiras() {
        String formatarSaida = "------| Informações Financeiras |-------\n";
        formatarSaida += financeiro.obterBalancoContas();
        formatarSaida += financeiro.obterFolhaPagamento();

        return formatarSaida;
    }

    public String obterInformacoesProfessores() {
        String formatarSaida = "------| Informações dos Professores |-------\n";
        formatarSaida += professores.obterAlocacaoPorDisciplina();
        formatarSaida += professores.obterTempoDeCasa();

        return formatarSaida;
    }

    public String obterInformacoesAlunos() {
        String formatarSaida = "------| Informações dos Alunos |-------\n";
        formatarSaida += alunos.obterHistorico();
        formatarSaida += alunos.obterRDM();
        return formatarSaida;
    }

    public String obterInformacoesAlmoxarifado() {
        System.out.println("------| Informações do Almoxarifado |-------\n");
        String formatarSaida = almoxarifado.obterPedidosCompra();
        almoxarifado.obterEstoque().imprimirEstoque();
        return formatarSaida;
    }

    public String obterInformacoesInfraestrutura() {
        String formatarSaida = "------| Informações de Infraestrutura |-------\n";
        formatarSaida += infraestrutura.obterAlocacaoSalas();
        return formatarSaida;
    }
}