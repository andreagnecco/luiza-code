package com.andreagnecco;

import com.andreagnecco.conta.Conta;
import com.andreagnecco.conta.ContaCorrente;
import com.andreagnecco.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Conta contaAndrea = new ContaCorrente(104,"Andrea",100);
        Conta contaJulliana = new ContaPoupanca(105,"Julliana",40.00);
        Conta contaAna = new ContaCorrente(106,"Ana",50.00);

        Pessoa andrea = new Pessoa("Andrea","000.000.000-00", "Rua Pernambuco",contaAndrea);
        Pessoa julliana = new Pessoa("Julliana","111.111.111-11", "Rua São Paulo",contaJulliana);
        Pessoa ana = new Pessoa("Ana","222.222.222-22","Rua Santa Catarina",contaAna);

        //realizar saque

        andrea.getConta().sacar(200.01);
        julliana.getConta().sacar(20);
        ana.getConta().transferir(20);
        ana.getConta().sacar(50);
        ana.getConta().sacar(80);

        System.out.println(Conta.getTotalDeContas());


//        System.out.printf("O saldo de %s, com conta número %d, é de %.0f.\n", contaAndrea.getDono(),contaAndrea.getNumero(),contaAndrea.getSaldo());
//        System.out.printf("O saldo de %s, com conta número %d, é de %.0f.\n", contaJulliana.getDono(),contaJulliana.getNumero(),contaJulliana.getSaldo());
//        System.out.printf("O saldo de %s, com conta número %d, é de %.0f.\n", contaAna.getDono(),contaAna.getNumero(),contaAna.getSaldo());


        contaAndrea.verInfo();
        contaAna.verInfo();
        contaJulliana.verInfo();


//        System.out.printf("A cliente %s, com o cpf %s e o saldo está em %.0f", andrea.getNome(),andrea.getCpf(), contaAndrea.getSaldo());


    }
}
