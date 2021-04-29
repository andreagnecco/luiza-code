package com.andreagnecco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double peso;
        double altura;


        System.out.println("Informe seu peso em kg: ");
        peso = sc.nextDouble();

        System.out.println("Informe sua altura em metros: ");
        altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f.\n", imc);



    }
}
