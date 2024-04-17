package Financeiro;

import java.util.Random;

public class Conta {
    double saldo;

    public Conta() {
        this.saldo = this.gerarSaldo();
    }

    private double gerarSaldo() {
        Random random = new Random();
        double saldoGerado = 5000 + (random.nextDouble() * (20000 - 5000));
        return saldoGerado;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
