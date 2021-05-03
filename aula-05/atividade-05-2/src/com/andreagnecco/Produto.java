package com.andreagnecco;

public class Produto {

    //attributes

    private String nome;
    private long codigo;

    //constructor

    public Produto(String nome, long codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    //methods

    public String consultaNome(){
        return nome;
    }

}
