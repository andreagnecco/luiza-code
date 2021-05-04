package com.andreagnecco;

public class Main {

    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.setNome("Tainá");
        professor.setCurso("Java");

        System.out.printf("O nome da professora é %s, e o curso é de linguagem %s, da Luiza Code.", professor.getNome(), professor.getCurso());

    }
}
