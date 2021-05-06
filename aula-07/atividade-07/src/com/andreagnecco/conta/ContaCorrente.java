package com.andreagnecco.conta;

public class ContaCorrente extends Conta {

    // LIMITE é fixo, e o saldo deve ser atualizado conforme o limite vai sendo utilizado
    private static final double LIMITE = 100.00;

    public ContaCorrente(int numero, String dono, double saldo) {
        super(numero, dono, saldo);

    }

    /**
     * O valor a ser sacado deve ser igual ou menor do que o saldo + LIMITE
     */
    public boolean sacar(double valor) {
        if (valor <= this.saldo + LIMITE) {
           this.saldo = this.saldo - valor;
            return true;
        } else {
            System.out.printf("Não foi possível sacar %.2f, da conta de %s.\n", valor, this.getDono());
            System.out.printf("O valor máximo disponível para saque é %f", this.saldo + LIMITE);
            return false;
        }
    }

}
