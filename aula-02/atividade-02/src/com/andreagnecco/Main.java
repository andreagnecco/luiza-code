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

        if (imc < 19.1) {
            System.out.println("Obeso.");
        } else if (imc >= 19.1 && imc <= 25.8) {
            System.out.println("No peso normal.");
        } else if (imc > 25.8 && imc <= 27.3 ) {
            System.out.println("Marginalmente acima do peso.");
        } else if (imc > 27.3 && imc <=32.3) {
            System.out.println("Acima do peso ideal.");
        } else {
            System.out.println("Obeso.");
        }


    }
}
