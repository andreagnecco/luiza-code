package com.andreagnecco;

public class Compra {

    //attributes

    private Pessoa pessoa;
    private Produto produto;

    //constructor

//    public Compra(Pessoa pessoa, Produto produto) {
//        this.pessoa = pessoa;
//        this.produto = produto;
//    }

    //methods

    public void comprar(Pessoa pessoa,Produto produto) {
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public String verificarCompra() {
        return produto.consultaNome();
    }

}
