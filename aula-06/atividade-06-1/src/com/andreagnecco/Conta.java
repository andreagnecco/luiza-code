package com.andreagnecco;

public class Conta {

    private int numero;
    private String dono;
    private double saldo;

    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
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
            this.saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public void transferir(double valor) {
        this.saldo = saldo + valor;
    }
}


