package com.andreagnecco;

public class Aluna {

    private String nome;
    private double nota1;
    private double nota2;
    private double media;

    public void calcularMedia (double nota1,double nota2) {
        media = (nota1 + nota2)/2;
    }

    public double getMedia() {
        return media;
    }

}
