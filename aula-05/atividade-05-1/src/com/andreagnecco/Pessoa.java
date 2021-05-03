package com.andreagnecco;

public class Pessoa {

    String nome;
    int idade;
    int cnh;

    public Pessoa(String nome, int idade, int cnh) {
        this.nome = nome;
        this.idade = idade;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public void dirigir () {
        System.out.println("Dirigindo");
    }

    public void dormir () {
        System.out.println("Dormindo");
    }

    public boolean comer () {
        return true;
    }

}
