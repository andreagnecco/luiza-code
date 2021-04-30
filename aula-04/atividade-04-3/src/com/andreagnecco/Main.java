package com.andreagnecco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<String>();

        nomes.add("Andrea");
        nomes.add("Ana");
        nomes.add("Tempestade");
        nomes.add("Vaquinha");
        nomes.add("Pérola");

        Collections.reverse(nomes);

        System.out.println("Lista nomes:\n");
        for (String nome : nomes) {
            System.out.println(nome);
        }


    }
}
