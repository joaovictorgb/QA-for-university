class Main {
    public static void main(String[] args) {
        SIG sig = new SIG();

        System.out.println(sig.obterInformacoesAdministrativas()); 
        System.out.println(sig.obterInformacoesFinanceiras()); 
        System.out.println(sig.obterInformacoesProfessores()); 
        System.out.println(sig.obterInformacoesAlunos());
        System.out.println(sig.obterInformacoesAlmoxarifado());
        System.out.println(sig.obterInformacoesInfraestrutura());
    }
}
