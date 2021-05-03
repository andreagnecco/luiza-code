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

    // mesma coisa que get Endereco
    public Endereco consultaEndereco() {
        return endereco;
    }

    // mesma coisa que get Nome
    public String consultaNome() {
        return nome;
    }

}
