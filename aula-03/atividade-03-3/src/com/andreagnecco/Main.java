package com.andreagnecco;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double number;
        int operator;
        double result;

        do {
            System.out.println("Digite um número:\n");
            number = sc.nextDouble();
            System.out.println("Escolha a operação:\n" +
                    "Código 1 -- Raiz quadrada\n" +
                    "Código 2 -- Divisão por 2\n" +
                    "Código 3 -- 10% do número\n" +
                    "Código 4 -- Multiplicação por 2\n" +
                    "Código 5 -- Sair\n");
            operator = sc.nextInt();

            if (operator == 1) {
                result = Math.sqrt(number);
                System.out.printf("Seu resultado é %.1f\n",result);

            } else if (operator == 2) {
                result = number / 2;
                System.out.printf("Seu resultado é %.1f\n",result);

            } else if (operator == 3) {
                result = number * 0.1;
                System.out.printf("Seu resultado é %.1f\n",result);

            } else if (operator == 4) {
                result = number * 2;
                System.out.printf("Seu resultado é %.1f\n",result);

            } else if (operator == 5) {
                System.out.println("Saindo do programa.\n");

            } else {
                System.out.println("Operador inválido, tente novamente.\n");
            }

        } while (operator != 5);

    }
}