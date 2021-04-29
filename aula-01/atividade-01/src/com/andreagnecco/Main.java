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

        if (imc >= 40) {
            System.out.println("Seu IMC é Obesidade Classe 3.");
        } else if (imc>=35) {
            System.out.println("Seu IMC é Obesidade Classe 2.");
        } else if (imc >=30) {
            System.out.println("Seu IMC é OBesidade Classe 1.");
        } else if (imc >=25) {
            System.out.println("Seu IMC indica excesso de peso.");
        } else if (imc >=18.5) {
            System.out.println("Seu IMC indica peso normal.");
        } else {
            System.out.println("Seu IMC indica baixo peso.");
        }


    }
}
