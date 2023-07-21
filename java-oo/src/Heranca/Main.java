package Heranca;

import Heranca.Animais.Cachorro;
import Heranca.Animais.Cavalo;
import Heranca.Animais.Gato;
import Heranca.Pai.Pai;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args){


        Scanner in = new Scanner(System.in);
        int idade;

        System.out.print("diga a idade do animal: ");
        idade = in.nextInt();

        /*Herança*/

        Cachorro totoco = new Cachorro("totoco", "preto", "vira lata");
        Gato xani = new Gato("xani", "cinza", "vira lata");
        Cavalo juleitunes = new Cavalo("juleitunes", "azul", "vira lata");

        totoco.setIdade(idade);

        System.out.println(totoco.getNome());
        totoco.fala();
        totoco.dizIdade();
        xani.fala();
        juleitunes.fala();

    }
}
