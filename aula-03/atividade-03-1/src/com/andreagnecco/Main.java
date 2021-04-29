package com.andreagnecco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner escolhaUsuario = new Scanner(System.in);

        System.out.println("Por favor, informe o código do item do seu pedido:\n" +
                "100 --- Cachorro-quente - Preço 1.20\n" +
                "101 --- Bauru simples --- Preço 1.30\n" +
                "102 --- Bauru com ovo --- Preço 1.50\n" +
                "103 --- Hambúrguer ------ Preço 1.20\n" +
                "104 --- Cheeseburguer --- Preço 1.30\n" +
                "105 --- Refrigerante ---- Preço 1.00");

        int pedido = escolhaUsuario.nextInt();

        System.out.println("Informe a quantidade:\n");

        int qtde = escolhaUsuario.nextInt();

        double valorTotal = 0;

        switch (pedido) {

            case 100:
                valorTotal = qtde * 1.2;
                System.out.printf("Você escolheu o cachorro quente, %d unidades, e o valor total é %.1f.", qtde, valorTotal);
                break;

            case 101:
                valorTotal = qtde * 1.3;
                System.out.printf("Você escolheu o bauru simples, %d unidades, e o valor total é %.1f.", qtde, valorTotal);
                break;

            case 102:
                valorTotal = qtde * 1.5;
                System.out.printf("Você escolheu o bauru com ovo, %d unidades, e o valor total é %.1f.", qtde, valorTotal);
                break;

            case 103:
                valorTotal = qtde * 1.2;
                System.out.printf("Você escolheu o hamburguer, %d unidades, e o valor total é %.1f.", qtde, valorTotal);
                break;

            case 104:
                valorTotal = qtde * 1.3;
                System.out.printf("Você escolheu o cheeseburguer, %d unidades, e o valor total é %.1f.", qtde, valorTotal);
                break;

            case 105:
                valorTotal = qtde * 1.0;
                System.out.printf("Você escolheu o refrigerante, %d unidades, e o valor total é %.1f.", qtde, valorTotal);
                break;

            default:
                System.out.println("Pedido inválido");
        }

        System.out.println("\nVolte sempre!");
    }
}
