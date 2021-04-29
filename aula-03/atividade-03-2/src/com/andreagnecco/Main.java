package com.andreagnecco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int div = 0;

        System.out.println("Digite o número pelo o qual você quer verificar a divisão");
        div = sc.nextInt();

        System.out.println("Digite o primeiro número:\n");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo número:\n");
        n2 = sc.nextInt();

        for (int count = n1; count < n2; count++) {
            if (count % div == 0) {
                System.out.printf("%d é um número divisível por %d entre %d e %d.\n",count,div, n1, n2);
            }
        }

    }
}
