package Personagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        /*Métodos*/

        Personagem semiDeus = new Personagem();

        String nome, superPoder, parceiroNome, corDaRoupa;
        boolean temParceiro;
        int passos = 0;

        System.out.print("defina um nome para o semiDeus : ");
        nome = input.next();
        System.out.print("defina um super poder para o semiDeus : ");
        superPoder = input.next();
        System.out.print("o semiDeus tem um parceiro?");
        temParceiro = input.nextBoolean();

        if (temParceiro){
            System.out.print("escreva o nome do parceiro: ");
            parceiroNome = input.next();
            semiDeus.parceiro = parceiroNome;
        }

        System.out.print("defina a cor da roupa do semiDeus : ");
        corDaRoupa = input.next();

        semiDeus.nome = nome;
        semiDeus.superPoder = superPoder;
        semiDeus.corDaRoupa = corDaRoupa;

        if (temParceiro){
            semiDeus.mostrarPersonagemComParceiro();
        }else {
            semiDeus.mostrarPersonagemSemParceiro();
        }

        semiDeus.falar(semiDeus.nome);

        semiDeus.andar(passos);
        }
}
