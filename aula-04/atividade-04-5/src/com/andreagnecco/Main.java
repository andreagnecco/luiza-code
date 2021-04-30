package com.andreagnecco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(3);
        numeros.add(10);
        numeros.add(20);
        numeros.add(70);
        numeros.add(6);
        numeros.add(100);
        numeros.add(4);
        numeros.add(9);
        numeros.add(0);
        numeros.add(1);


        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("O maior número é:\n" + Collections.max(numeros));

        }

    }

