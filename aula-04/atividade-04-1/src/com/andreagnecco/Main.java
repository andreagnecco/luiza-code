package com.andreagnecco;

public class Main {

    public static void main(String[] args) {

        String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i=0;i<=11;i++) // or initializer is int i = 0 and condition is i < meses.length //
        System.out.printf("O mês de %s tem %d dias.\n",meses[i],dias[i]);

    }
}
