package Exercises.Q1.Main;

import Exercises.Q1.Empregado.Empregado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String nome, sobrenome;
        double salarioMensal;

        System.out.println("digite o nome do empregado 1: ");
        nome = in.next();
        System.out.println("digite o sobrenome do empregado 1: ");
        sobrenome = in.next();
        System.out.println("digite o salario dele: ");
        salarioMensal = in.nextDouble();

        Empregado empregado1 = new Empregado(nome, sobrenome, salarioMensal);
        Empregado empregado2 = new Empregado("pedro", "sousa", salarioMensal);


        System.out.println("nome: "+ empregado1.getNome());
        System.out.println("sobrenome: "+empregado1.getSobrenome());
        empregado1.setSalarioMensal(salarioMensal);
        System.out.println("salario: "+empregado1.getSalarioMensal());

        System.out.println("nome: "+empregado2.getNome());
        System.out.println("sobrenome: "+empregado2.getSobrenome());
        empregado2.setSalarioMensal(salarioMensal);
        System.out.println("salario: "+empregado2.getSalarioMensal());

        empregado1.aumentarSalario(0.1);
        empregado2.aumentarSalario(0.1);

        System.out.println("o novo salario do empregado "+ empregado1.getNome()+ " eh de: "+ empregado1.getSalarioMensal());
        System.out.println("o novo salario do empregado "+ empregado2.getNome()+ " eh de: "+ empregado2.getSalarioMensal());
    }

}
