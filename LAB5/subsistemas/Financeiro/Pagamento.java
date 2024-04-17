package Financeiro;

import java.util.Random;

public class Pagamento {
    private String funcionarioNome;
    private double salario;
    static private int index = 0;

    public Pagamento() {
        Pagamento.index += 1;
        this.funcionarioNome = "Funcionario " + Pagamento.index;
        this.salario = this.gerarSalario();
    }

    private double gerarSalario() {
        Random random = new Random();
        double salarioGerado = 1000 + (random.nextDouble() * (2500 - 1000));
        return salarioGerado;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getFuncionarioNome() {
        return this.funcionarioNome;
    }
}
