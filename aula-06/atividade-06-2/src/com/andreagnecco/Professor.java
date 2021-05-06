package com.andreagnecco;

public class Professor {

    private String nome;
    private String curso;
    private int cpf;
    private double horaAula = 29.00;
    private double salario;
    private String alunos[];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setSalarioProfessor(int aulas) {
        this.salario = aulas * horaAula;
    }

    public double getSalario() {
        return salario;
    }

}
