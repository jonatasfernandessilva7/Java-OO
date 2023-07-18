package Construtor;

import Construtor.Classes.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        Pessoa pessoa = new Pessoa("joão");

        System.out.println(pessoa.getNome());

//        String nome;
//        int idade;
//        double altura;
//
//        System.out.print("digite seu nome: ");
//        nome = in.next();
//        System.out.print("digite sua idade: ");
//        idade = in.nextInt();
//        System.out.print("digite sua altura: ");
//        altura = in.nextDouble();
//
//        pessoa.setNome(nome);
//        pessoa.setIdade(idade);
//        pessoa.setAltura(altura);
//
//        pessoa.getNome();
//        pessoa.getIdade();
//        pessoa.getAltura();

    }
}
