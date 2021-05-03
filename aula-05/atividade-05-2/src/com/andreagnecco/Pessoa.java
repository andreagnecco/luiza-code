package com.andreagnecco;

public class Pessoa {

    //attributes

    private String nome;
    private String numero;
    private Endereco endereco;

    //constructor

    public Pessoa(String nome, String numero, Endereco endereco) {
        this.nome = nome;
        this.numero = numero;
        this.endereco = endereco;
    }

    //methods

    public Endereco consultaEndereco() {
        return endereco;
    }

    public String consultaNome() {
        return nome;
    }

}
