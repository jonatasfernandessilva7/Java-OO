package Heranca.Animais;

import Heranca.Interface.Animais;
import Heranca.Pai.Pai;

public class Gato extends Pai implements Animais {


    public Gato(String nome, String cor, String raca){
        super(nome, cor, raca);
    }

    @Override
    public void acordar(){
        System.out.println("miau estou acordado");
    }

    @Override
    public void comer(){
        System.out.println("miau estou comendo!");
    }

    @Override
    public void dormir(){
        System.out.println("miau que sono vou dormir agora");
    }

    @Override
    public void fala(){
        System.out.println("miau");
    }

    @Override
    public void dizIdade(){
        System.out.println("tenho "+ getIdade() + " anos");
    }
}
