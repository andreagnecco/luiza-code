package com.andreagnecco;

public class Endereco {

    //attributes

    private String estado;
    private String cidade;
    private String logradouro;

    //constructor

    public Endereco(String estado, String cidade, String logradouro) {
        this.estado = estado;
        this.cidade = cidade;
        this.logradouro = logradouro;
    }

    //methods

    public String toString(){
        return logradouro + ", " + cidade + " - " + estado;
    }

    public String consultaLogradouro() {
        return logradouro;
    }

}
