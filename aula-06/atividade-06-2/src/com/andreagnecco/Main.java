package com.andreagnecco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Professor professor = new Professor();
        Aluna aluna = new Aluna();
        Scanner sc = new Scanner(System.in);

        professor.setNome("Tainá");
        professor.setCurso("Java");

        System.out.printf("O nome da professora é %s e o curso é de linguagem %s, do programa Luiza Code.\n\n", professor.getNome(), professor.getCurso());

        System.out.println("CÁLCULO DE SALÁRIO:\n" + "Digite o número de aulas:\n");
        int aulas = sc.nextInt();

        professor.setSalarioProfessor(aulas);

        System.out.printf("O salário da professora %s é %.2f.\n",professor.getNome(),professor.getSalario());

        System.out.println("Agora, informe sua primeira nota:\n");
        double nota1 = sc.nextDouble();
        System.out.println("Agora, informe sua segunda nota:\n");
        double nota2 = sc.nextDouble();

        aluna.calcularMedia(nota1,nota2);

        System.out.printf("Sua média foi %.2f\n",aluna.getMedia());

        if (aluna.getMedia() >= 7) {
            System.out.println("Aprovada!");
        } else {
            System.out.println("Reprovada!");
        }




    }
}
