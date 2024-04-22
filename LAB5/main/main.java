package main;
class Main {
    public static void main(String[] args) {
        SIG sig = new SIG();

        sig.almoxarifado.adicionarItemAoEstoque("Caixas", 5);
        sig.almoxarifado.registrarPedidoCompra(1, "Fornecedor A", "22/04");
        sig.alunos.adicionarDisciplinaConcluida("Matemática Discreta");
        sig.alunos.adicionarNota("Matemática Discreta", 8);
        sig.infraestrutura.alocarSala("Sala 1", "Ocupante 1");
        

        System.out.println(sig.obterInformacoesAdministrativas()); 
        System.out.println(sig.obterInformacoesFinanceiras()); 
        System.out.println(sig.obterInformacoesProfessores()); 
        System.out.println(sig.obterInformacoesAlunos());
        System.out.println(sig.obterInformacoesAlmoxarifado());
        System.out.println(sig.obterInformacoesInfraestrutura());
    }
}
