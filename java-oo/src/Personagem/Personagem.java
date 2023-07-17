package Personagem;

import java.util.Scanner;

public class Personagem {

    //atributos
    String nome;
    String superPoder;
    String parceiro;
    String corDaRoupa;

    //métodos sem parametro

    void mostrarPersonagemComParceiro(){
        System.out.println("nome: " + nome + "\n" +
                "super poder: " + superPoder + "\n" +
                "parceiro: " + parceiro + "\n" +
                "cor da roupa: " + corDaRoupa + "\n");
    }
    void mostrarPersonagemSemParceiro(){
        System.out.println("nome: " + nome + "\n" +
                "super poder: " + superPoder + "\n" +
                "cor da roupa: " + corDaRoupa + "\n");
    }

    //métodos com parametro

    void falar(String nome){
        System.out.println("meu nome eh: " + nome);
    }

    int andar(int andando){

        Scanner input = new Scanner(System.in);

        int passos = 0;

        do {
            System.out.println("você quer andar? 1 = sim, 0 = não ");
            andando = input.nextInt();
            if(andando == 1){
                passos += 1;
            }

            if(passos >= 10){
                System.out.println("voce eh um atleta hein..andou " + passos + " passos");
            }

        }while (andando != 0);

        return passos;

    }

}
