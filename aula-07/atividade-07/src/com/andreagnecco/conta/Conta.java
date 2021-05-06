package com.andreagnecco.conta;

public class Conta {

    private int numero;
    private String dono;
    protected double saldo;
    private static int totalDeContas;

    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }

    public int getNumero() {
        return numero;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public void transferir(double valor) {
        this.saldo = saldo + valor;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public void verInfo() {
        System.out.printf("O saldo de %s, com conta número %d, é de %.0f.\n", dono, numero, saldo);
    }
}
