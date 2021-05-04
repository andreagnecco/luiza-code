package com.andreagnecco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Professor professor = new Professor();
        Scanner sc = new Scanner(System.in);

        professor.setNome("Tainá");
        professor.setCurso("Java");

        System.out.printf("O nome da professora é %s e o curso é de linguagem %s, do programa Luiza Code.\n\n", professor.getNome(), professor.getCurso());

        System.out.println("CÁLCULO DE SALÁRIO:\n" + "Digite o número de aulas:\n");
        int aulas = sc.nextInt();

        professor.setSalarioProfessor(aulas);

        System.out.printf("O salário da professora %s é %.2f",professor.getNome(),professor.getSalario());

    }
}
