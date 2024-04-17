import Administrativa.Administrativa;
import Financeiro.Financeiro;
import Professores.Professores;
import Alunos.Alunos;
import Almoxarifado.Almoxarifado;
import Infraestrutura.Infraestrutura;

public class SIG {
    private Administrativa administrativo;
    private Financeiro financeiro;
    private Professores professores;
    private Alunos alunos;
    private Almoxarifado almoxarifado;
    private Infraestrutura infraestrutura;

    public SIG() {
        administrativo = new Administrativa();
        financeiro = new Financeiro();
        professores = new Professores();
        alunos = new Alunos(null, 0);
        almoxarifado = new Almoxarifado();
        infraestrutura = new Infraestrutura();
    }

    public String obterInformacoesAdministrativas() {
        String formatarSaida = "\n=-=-=-=| Informações Administrativas |=-=-=-=-=\n";
        formatarSaida += administrativo.obterReunioesAgendadas();
        formatarSaida += administrativo.obterEntrevistas();

        return formatarSaida;
    }

    public String obterInformacoesFinanceiras() {
        String formatarSaida = "=-=-=-=| Informações Financeiras |=-=-=-=-=\n";
        formatarSaida += financeiro.obterBalancoContas();
        formatarSaida += financeiro.obterFolhaPagamento();

        return formatarSaida;
    }

    public String obterInformacoesProfessores() {
        String formatarSaida = "=-=-=-=| Informações dos Professores |=-=-=-=-=\n";
        formatarSaida += professores.obterAlocacaoPorDisciplina();
        formatarSaida += professores.obterTempoDeCasa();

        return formatarSaida;
    }

    public String obterInformacoesAlunos() {
        return alunos.obterHistorico() + "\n" + alunos.obterRDM();
    }

    public String obterInformacoesAlmoxarifado() {
        return almoxarifado.obterEstoque() + "\n" + almoxarifado.obterPedidosCompra();
    }

    public String obterInformacoesInfraestrutura() {
        return infraestrutura.obterAlocacaoSalas();
    }
}