package com.andreagnecco;

public class Main {

    public static void main(String[] args) {

        Conta contaAndrea = new Conta(104,"Andrea",100.00);
        Conta contaJulliana = new Conta(105,"Julliana",40.00);
        Conta contaAna = new Conta(106,"Ana",50.00);

        Pessoa andrea = new Pessoa("Andrea","000.000.000-00", "Rua Pernambuco",contaAndrea);
        Pessoa julliana = new Pessoa("Julliana","111.111.111-11", "Rua São Paulo",contaJulliana);
        Pessoa ana = new Pessoa("Ana","222.222.222-22","Rua Santa Catarina",contaAna);

        //realizar saque

        andrea.getConta().sacar(90);
        julliana.getConta().sacar(20);
        ana.getConta().transferir(20);
        ana.getConta().sacar(50);

        System.out.println();


        System.out.printf("O saldo de %s, com conta número %d, é de %.0f.\n", contaAndrea.getDono(),contaAndrea.getNumero(),contaAndrea.getSaldo());
        System.out.printf("O saldo de %s, com conta número %d, é de %.0f.\n", contaJulliana.getDono(),contaJulliana.getNumero(),contaJulliana.getSaldo());
        System.out.printf("O saldo de %s, com conta número %d, é de %.0f.\n", contaAna.getDono(),contaAna.getNumero(),contaAna.getSaldo());





//        System.out.printf("A cliente %s, com o cpf %s e o saldo está em %.0f", andrea.getNome(),andrea.getCpf(), contaAndrea.getSaldo());


    }
}
