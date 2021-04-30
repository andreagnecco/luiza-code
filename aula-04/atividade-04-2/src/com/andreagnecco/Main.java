package com.andreagnecco;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //criando o objeto coisas do tipo List

        List dados = new ArrayList();

        //cadastrando valores na lista

        dados.add("Andrea");
        dados.add(2);
        dados.add("A");
        dados.add(1.99);
        dados.add("1.99");
        dados.add(1);
        dados.add(100);
        dados.add("B");
        dados.add(1.00011001);
        dados.add("5");

        for(Object dado: dados) {
            System.out.println(dado);
        }



    }
}
