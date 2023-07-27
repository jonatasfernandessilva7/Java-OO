package Exercises.Q2.Main;

import Exercises.Q2.Fatura.Fatura;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int numeroDoItemFaturado;
        String descricao;
        int quatidadeComprada;
        double precoUnitarioDoItem;
        double precoTotalDaFatura;

        System.out.println("digite o código do item a ser faturado: ");
        numeroDoItemFaturado = in.nextInt();
        System.out.println("digite a descricao do item a ser faturado: ");
        descricao = in.next();
        System.out.println("digite a quantidade de itens a ser faturada: ");
        quatidadeComprada = in.nextInt();
        System.out.println("digite o preco unitario do item a ser faturado: ");
        precoUnitarioDoItem = in.nextDouble();

        Fatura produto = new Fatura(numeroDoItemFaturado, descricao, quatidadeComprada, precoUnitarioDoItem);

        System.out.println("o numero do item selecionado eh: "+produto.getNumeroDoItemFaturado());
        System.out.println("o produto escolhido foi: "+produto.getDescricao());
        System.out.println("a quantidade de itens comprados foi de: "+produto.getQuatidadeComprada());
        System.out.println("cada item custa: "+produto.getPrecoUnitarioDoItem());

        precoTotalDaFatura = produto.calculaDesconto(0.1);

        System.out.println("o preco da sua fatura apos o desconto eh de : "+precoTotalDaFatura);

    }
}
