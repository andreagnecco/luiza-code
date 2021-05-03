package com.andreagnecco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //instance objects

        //PRODUCTS
        Produto playstation = new Produto("Playstations 5",1);
        Produto notebook = new Produto("Lenovo Yoga 740", 2);

        //SCANNER

        Scanner entrada = new Scanner(System.in);

        //print user messages - signing

        System.out.println("Por favor, digite o seu nome:\n");
        String nome = entrada.nextLine();
        System.out.println("Por favor, digite o seu número de telefone:\n");
        String numero = entrada.nextLine();
        System.out.println("Por favor, digite o seu Endereco:\n");
        System.out.println("Estado:\n");
        String estado = entrada.nextLine();
        System.out.println("Cidade:\n");
        String cidade = entrada.nextLine();
        System.out.println("Logradouro:\n");
        String logradouro = entrada.nextLine();

        //PERSON

        Endereco endereco = new Endereco(estado,cidade,logradouro);
        Pessoa usuario = new Pessoa(nome,numero,endereco);



        //print user messages - buying

        System.out.println("Digite o código do seu produto:\n");
        System.out.printf("Código %d - %s\n", playstation.getCodigo(), playstation.consultaNome());
        System.out.printf("Código %d - %s\n", notebook.getCodigo(), notebook.consultaNome());
        long codigo = entrada.nextLong();

        Compra compra = new Compra();

        if (codigo == 1) {
            compra.comprar(usuario,playstation);
        } else if (codigo == 2) {
            compra.comprar(usuario,notebook);
        } else {
            System.out.println("Código inválido, tente novamente");
        }




        System.out.printf("Sua compra %s vai para o endereço cadastrado: %s\n", compra.verificarCompra() ,usuario.consultaEndereco());
        System.out.printf("Confirmação de nome: %s",usuario.consultaNome());

    }
}
